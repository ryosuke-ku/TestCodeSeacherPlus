// clone pairs:788:86%
// 312:kafka/clients/src/main/java/org/apache/kafka/common/requests/ApiVersionsResponse.java

public class Nicad_kafka20
{
    protected Struct toStruct(short version) {
        Struct struct = new Struct(ApiKeys.API_VERSIONS.responseSchema(version));
        struct.setIfExists(THROTTLE_TIME_MS, throttleTimeMs);
        struct.set(ERROR_CODE, error.code());
        List<Struct> apiVersionList = new ArrayList<>();
        for (ApiVersion apiVersion : apiKeyToApiVersion.values()) {
            Struct apiVersionStruct = struct.instance(API_VERSIONS_KEY_NAME);
            apiVersionStruct.set(API_KEY_NAME, apiVersion.apiKey);
            apiVersionStruct.set(MIN_VERSION_KEY_NAME, apiVersion.minVersion);
            apiVersionStruct.set(MAX_VERSION_KEY_NAME, apiVersion.maxVersion);
            apiVersionList.add(apiVersionStruct);
        }
        struct.set(API_VERSIONS_KEY_NAME, apiVersionList.toArray());
        return struct;
    }
}