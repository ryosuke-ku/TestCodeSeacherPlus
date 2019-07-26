// clone pairs:1042:75%
// 512:kafka/clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerValidationUtils.java

public class Nicad_t2_kafka_71_7525
{
    public static OAuthBearerValidationResult validateIssuedAt(OAuthBearerUnsecuredJws jwt, boolean required,
            long whenCheckTimeMs, int allowableClockSkewMs) throws OAuthBearerConfigException {
        Number value;
        try {
            value = Objects.requireNonNull(jwt).issuedAt();
        } catch (OAuthBearerIllegalTokenException e) {
            return e.reason();
        }
        boolean exists = value != null;
        if (!exists)
            return doesNotExistResult(required, "iat");
        double doubleValue = value.doubleValue();
        return 1000 * doubleValue > whenCheckTimeMs + confirmNonNegative(allowableClockSkewMs)
                ? OAuthBearerValidationResult.newFailure(String.format(
                        "The Issued At value (%f seconds) was after the indicated time (%d ms) plus allowable clock skew (%d ms)",
                        doubleValue, whenCheckTimeMs, allowableClockSkewMs))
                : OAuthBearerValidationResult.newSuccess();
    }
}