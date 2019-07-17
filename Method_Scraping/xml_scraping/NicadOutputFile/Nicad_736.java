public class Nicad_736
{
    private static boolean dependenciesEquals( List<Dependency> a, List<Dependency> b )
    {
        if ( a.size() != b.size() )
        {
            return false;
        }

        Iterator<Dependency> aI = a.iterator();
        Iterator<Dependency> bI = b.iterator();

        while ( aI.hasNext() )
        {
            Dependency aD = aI.next();
            Dependency bD = bI.next();

            boolean r = Objects.equals( aD.getGroupId(), bD.getGroupId() ) //
                && Objects.equals( aD.getArtifactId(), bD.getArtifactId() ) //
                && Objects.equals( aD.getVersion(), bD.getVersion() ) //
                && Objects.equals( aD.getType(), bD.getType() ) //
                && Objects.equals( aD.getClassifier(), bD.getClassifier() ) //
                && Objects.equals( aD.getScope(), bD.getScope() );

            r &= exclusionsEquals( aD.getExclusions(), bD.getExclusions() );

            if ( !r )
            {
                return false;
            }
        }

        return true;
    }
}