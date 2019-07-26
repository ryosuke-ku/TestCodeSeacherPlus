// clone pairs:806:81%
// 1344:kylin/server-base/src/main/java/org/apache/kylin/rest/response/SQLResponse.java

public class Nicad_t1_kylin148
{
    public SQLResponse(List<SelectedColumnMeta> columnMetas, List<List<String>> results, String cube,
            int affectedRowCount, boolean isException, String exceptionMessage, boolean isPartial, boolean isPushDown) {
        this.columnMetas = columnMetas;
        this.results = results;
        this.cube = cube;
        this.affectedRowCount = affectedRowCount;
        this.isException = isException;
        this.exceptionMessage = exceptionMessage;
        this.isPartial = isPartial;
        this.queryPushDown = isPushDown;
    }
}