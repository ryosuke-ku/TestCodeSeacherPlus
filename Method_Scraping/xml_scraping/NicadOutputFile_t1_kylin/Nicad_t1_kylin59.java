// clone pairs:493:76%
// 760:kylin/datasource-sdk/src/main/java/org/apache/kylin/sdk/datasource/adaptor/AdaptorConfig.java

public class Nicad_t1_kylin59
{
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AdaptorConfig that = (AdaptorConfig) o;

        if (poolMaxIdle != that.poolMaxIdle)
            return false;
        if (poolMaxTotal != that.poolMaxTotal)
            return false;
        if (poolMinIdle != that.poolMinIdle)
            return false;
        if (!url.equals(that.url))
            return false;
        if (!driver.equals(that.driver))
            return false;
        if (!username.equals(that.username))
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        return datasourceId != null ? datasourceId.equals(that.datasourceId) : that.datasourceId == null;
    }
}