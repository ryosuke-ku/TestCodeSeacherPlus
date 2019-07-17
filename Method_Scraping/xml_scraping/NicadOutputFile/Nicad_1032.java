public class Nicad_1032
{
    protected void mergeScm_Connection( Scm target, Scm source, boolean sourceDominant, Map<Object, Object> context )
    {
        String src = source.getConnection();
        if ( src != null )
        {
            if ( sourceDominant )
            {
                target.setConnection( src );
                target.setLocation( "connection", source.getLocation( "connection" ) );
            }
            else if ( target.getConnection() == null )
            {
                target.setConnection( extrapolateChildUrl( src, source.isChildScmConnectionInheritAppendPath(),
                                                           context ) );
                target.setLocation( "connection", source.getLocation( "connection" ) );
            }
        }
    }
}