// clone pairs:1090:72%
// 558:kafka/clients/src/main/java/org/apache/kafka/common/requests/DeleteAclsRequest.java

public class Nicad_t1_kafka_new49
{
    public void DeleteAclsRequest(Struct struct, short version) {
        super(ApiKeys.DELETE_ACLS, version);
        this.filters = new ArrayList<>();
        for (Object filterStructObj : struct.getArray(FILTERS)) {
            Struct filterStruct = (Struct) filterStructObj;
            ResourcePatternFilter resourceFilter = RequestUtils.resourcePatternFilterFromStructFields(filterStruct);
            AccessControlEntryFilter aceFilter = RequestUtils.aceFilterFromStructFields(filterStruct);
            this.filters.add(new AclBindingFilter(resourceFilter, aceFilter));
        }
    }
}