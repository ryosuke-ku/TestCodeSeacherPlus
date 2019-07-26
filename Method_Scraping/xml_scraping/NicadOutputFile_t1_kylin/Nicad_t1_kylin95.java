// clone pairs:604:76%
// 971:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/steps/lookup/LookupExecutableUtil.java

public class Nicad_t1_kylin95
{
    public static List<String> getSegments(Map<String, String> params) {
        final String ids = params.get(SEGMENT_IDS);
        if (ids != null) {
            final String[] splitted = StringUtils.split(ids, ",");
            ArrayList<String> result = Lists.newArrayListWithExpectedSize(splitted.length);
            Collections.addAll(result, splitted);
            return result;
        } else {
            return Collections.emptyList();
        }
    }
}