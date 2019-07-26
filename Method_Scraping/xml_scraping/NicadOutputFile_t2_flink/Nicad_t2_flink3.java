// clone pairs:18:100%
// 27:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t2_flink3
{
    protected void mergeModelBase_Repositories( ModelBase target, ModelBase source, boolean sourceDominant,
                                                Map<Object, Object> context )
    {
        List<Repository> src = source.getRepositories();
        if ( !src.isEmpty() )
        {
            List<Repository> tgt = target.getRepositories();
            Map<Object, Repository> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            List<Repository> dominant, recessive;
            if ( sourceDominant )
            {
                dominant = src;
                recessive = tgt;
            }
            else
            {
                dominant = tgt;
                recessive = src;
            }

            for ( Repository element : dominant )
            {
                Object key = getRepositoryKey( element );
                merged.put( key, element );
            }

            for ( Repository element : recessive )
            {
                Object key = getRepositoryKey( element );
                if ( !merged.containsKey( key ) )
                {
                    merged.put( key, element );
                }
            }

            target.setRepositories( new ArrayList<>( merged.values() ) );
        }
    }
}