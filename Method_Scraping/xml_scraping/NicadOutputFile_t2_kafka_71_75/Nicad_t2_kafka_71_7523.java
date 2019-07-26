// clone pairs:1025:75%
// 480:kafka/clients/src/main/java/org/apache/kafka/common/requests/DescribeAclsResponse.java

public class Nicad_t2_kafka_71_7523
{
    private void validate(short version) {
        if (version == 0) {
            final boolean unsupported = acls.stream()
                .map(AclBinding::pattern)
                .map(ResourcePattern::patternType)
                .anyMatch(patternType -> patternType != PatternType.LITERAL);
            if (unsupported) {
                throw new UnsupportedVersionException("Version 0 only supports literal resource pattern types");
            }
        }

        final boolean unknown = acls.stream().anyMatch(AclBinding::isUnknown);
        if (unknown) {
            throw new IllegalArgumentException("Contain UNKNOWN elements");
        }
    }
}