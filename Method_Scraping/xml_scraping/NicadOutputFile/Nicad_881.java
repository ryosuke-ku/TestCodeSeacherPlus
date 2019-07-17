public class Nicad_881
{
    protected void mergeModelBase_Properties( ModelBase target, ModelBase source, boolean sourceDominant,
                                              Map<Object, Object> context )
    {
        Properties merged = new Properties();
        if ( sourceDominant )
        {
            merged.putAll( target.getProperties() );
            merged.putAll( source.getProperties() );
        }
        else
        {
            merged.putAll( source.getProperties() );
            merged.putAll( target.getProperties() );
        }
        target.setProperties( merged );
        target.setLocation( "properties", InputLocation.merge( target.getLocation( "properties" ),
                                                               source.getLocation( "properties" ), sourceDominant ) );
    }
}