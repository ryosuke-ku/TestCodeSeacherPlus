// clone pairs:1020:75%
// 470:kafka/clients/src/main/java/org/apache/kafka/common/requests/CreateAclsRequest.java

public class Nicad_t2_kafka_71_7521
{
    protected Struct toStruct() {
        Struct struct = new Struct(ApiKeys.CREATE_ACLS.requestSchema(version()));
        List<Struct> requests = new ArrayList<>();
        for (AclCreation creation : aclCreations) {
            Struct creationStruct = struct.instance(CREATIONS_KEY_NAME);
            creation.setStructFields(creationStruct);
            requests.add(creationStruct);
        }
        struct.set(CREATIONS_KEY_NAME, requests.toArray());
        return struct;
    }
}