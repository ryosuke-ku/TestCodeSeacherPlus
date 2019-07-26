// clone pairs:730:83%
// 1205:kylin/query/src/main/java/org/apache/kylin/query/routing/RealizationCheck.java

public class Nicad_t1_kylin128
{
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            IncapableReason that = (IncapableReason) o;

            if (incapableType != that.incapableType)
                return false;
            if (notFoundColumns != null ? !notFoundColumns.equals(that.notFoundColumns) : that.notFoundColumns != null)
                return false;
            if (notFoundDimensions != null ? !notFoundDimensions.equals(that.notFoundDimensions)
                    : that.notFoundDimensions != null)
                return false;
            if (notFoundMeasures != null ? !notFoundMeasures.equals(that.notFoundMeasures)
                    : that.notFoundMeasures != null)
                return false;
            if (unmatchedDimensions != null ? !unmatchedDimensions.equals(that.unmatchedDimensions)
                    : that.unmatchedDimensions != null)
                return false;
            if (unmatchedAggregations != null ? !unmatchedAggregations.equals(that.unmatchedAggregations)
                    : that.unmatchedAggregations != null)
                return false;
            return notFoundTables != null ? notFoundTables.equals(that.notFoundTables) : that.notFoundTables == null;
        }
}