// clone pairs:331:100%
// 540:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant55
{
    public void setRetriesAllowed(String retriesAllowed) {
        if ("FOREVER".equalsIgnoreCase(retriesAllowed)) {
            this.retriesAllowed = Retryable.RETRY_FOREVER;
        } else {
            try {
                int retries = Integer.parseInt(retriesAllowed);
                if (retries < Retryable.RETRY_FOREVER) {
                    throw new BuildException(
                        "Invalid value for retriesAllowed attribute: %s",
                        retriesAllowed);
                }
                this.retriesAllowed = retries;
            } catch (NumberFormatException px) {
                throw new BuildException(
                    "Invalid value for retriesAllowed attribute: %s",
                    retriesAllowed);
            }
        }
    }
}