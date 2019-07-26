//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/TypeArtifactFilter.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java
// clone pairs:1010:90%
// 1737:maven/maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java

public class Nicad_t1_maven_0726293
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

            CacheKey that = (CacheKey) o;

            return Objects.equals( groupId, that.groupId ) && Objects.equals( artifactId, that.artifactId )
                && Objects.equals( version, that.version )
                && Objects.equals( dependencyArtifacts, that.dependencyArtifacts )
                && Objects.equals( workspace, that.workspace ) 
                && Objects.equals( localRepo, that.localRepo )
                && RepositoryUtils.repositoriesEquals( repositories, that.repositories )
                && Objects.equals( collect, that.collect ) 
                && Objects.equals( resolve, that.resolve )
                && aggregating == that.aggregating;
        }
}