// clone pairs:2:88%
// 4:kylin/stream-core/src/main/java/org/apache/kylin/stream/core/storage/columnar/FragmentFileSearcher.java

public class Nicad_t1_kylin1
{
        protected TupleFilter translateCompareFilter(CompareTupleFilter oldCompareFilter) {
            // extract ColumnFilter & ConstantFilter
            TblColRef externalCol = oldCompareFilter.getColumn();

            if (externalCol == null) {
                return oldCompareFilter;
            }

            Collection constValues = oldCompareFilter.getValues();
            if (constValues == null || constValues.isEmpty()) {
                return oldCompareFilter;
            }

            if (TimeDerivedColumnType.isTimeDerivedColumn(externalCol.getName()) && filterTimeRangeChecker != null) {
                CheckResult checkResult = filterTimeRangeChecker.check(oldCompareFilter,
                        TimeDerivedColumnType.getTimeDerivedColumnType(externalCol.getName()));
                if (checkResult == CheckResult.INCLUDED) {
                    return ConstantTupleFilter.TRUE;
                } else if (checkResult == CheckResult.EXCLUDED) {
                    return ConstantTupleFilter.FALSE;
                }
            }

            //CompareTupleFilter containing BuiltInFunctionTupleFilter will not reach here caz it will be transformed by BuiltInFunctionTransformer
            CompareTupleFilter newCompareFilter = new CompareTupleFilter(oldCompareFilter.getOperator());
            newCompareFilter.addChild(new ColumnTupleFilter(externalCol));

            //for CompareTupleFilter containing dynamicVariables, the below codes will actually replace dynamicVariables
            //with normal ConstantTupleFilter

            Object firstValue = constValues.iterator().next();
            int col = mapCol(externalCol);

            TupleFilter result;
            ByteArray code;

            // translate constant into code
            switch (newCompareFilter.getOperator()) {
            case EQ:
            case IN:
                Set newValues = Sets.newHashSet();
                for (Object value : constValues) {
                    code = translate(col, value, 0);
                    if (code != null)
                        newValues.add(code);
                }
                if (newValues.isEmpty()) {
                    result = ConstantTupleFilter.FALSE;
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(newValues));
                    result = newCompareFilter;
                }
                break;
            case NOTIN:
                Set notInValues = Sets.newHashSet();
                for (Object value : constValues) {
                    code = translate(col, value, 0);
                    if (code != null)
                        notInValues.add(code);
                }
                if (notInValues.isEmpty()) {
                    result = ConstantTupleFilter.TRUE;
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(notInValues));
                    result = newCompareFilter;
                }
                break;
            case NEQ:
                code = translate(col, firstValue, 0);
                if (code == null) {
                    result = ConstantTupleFilter.TRUE;
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(code));
                    result = newCompareFilter;
                }
                break;
            case LT:
                code = translate(col, firstValue, 0);
                if (code == null) {
                    code = translate(col, firstValue, -1);
                    if (code == null)
                        result = ConstantTupleFilter.FALSE;
                    else
                        result = newCompareFilter(FilterOperatorEnum.LTE, externalCol, code);
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(code));
                    result = newCompareFilter;
                }
                break;
            case LTE:
                code = translate(col, firstValue, -1);
                if (code == null) {
                    result = ConstantTupleFilter.FALSE;
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(code));
                    result = newCompareFilter;
                }
                break;
            case GT:
                code = translate(col, firstValue, 0);
                if (code == null) {
                    code = translate(col, firstValue, 1);
                    if (code == null)
                        result = ConstantTupleFilter.FALSE;
                    else
                        result = newCompareFilter(FilterOperatorEnum.GTE, externalCol, code);
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(code));
                    result = newCompareFilter;
                }
                break;
            case GTE:
                code = translate(col, firstValue, 1);
                if (code == null) {
                    result = ConstantTupleFilter.FALSE;
                } else {
                    newCompareFilter.addChild(new ConstantTupleFilter(code));
                    result = newCompareFilter;
                }
                break;
            default:
                throw new IllegalStateException("Cannot handle operator " + newCompareFilter.getOperator());
            }
            return result;
        }
}