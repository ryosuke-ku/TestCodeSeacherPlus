// clone pairs:1169:90%
// 2038:maven/maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java

public class Nicad_t1_maven_9060
{
        public boolean equals( Object o )
        {
            if ( o == this )
            {
                return true;
            }

            if ( !( o instanceof CacheKey ) )
            {
                return false;
            }

            CacheKey other = (CacheKey) o;

            return pomHash == other.pomHash && artifactEquals( artifact, other.artifact )
                && resolveManagedVersions == other.resolveManagedVersions
                && repositoriesEquals( repositories, other.repositories );
        }
}