// clone pairs:709:75%
// 1165:kylin/server-base/src/main/java/org/apache/kylin/rest/service/ModelService.java

public class Nicad_t1_kylin120
{
    public List<DataModelDesc> getModels(final String modelName, final String projectName, final Integer limit,
            final Integer offset) throws IOException {

        List<DataModelDesc> modelDescs = listAllModels(modelName, projectName, true);

        if (limit == null || offset == null) {
            return modelDescs;
        }

        if ((modelDescs.size() - offset) < limit) {
            return modelDescs.subList(offset, modelDescs.size());
        }

        return modelDescs.subList(offset, offset + limit);
    }
}