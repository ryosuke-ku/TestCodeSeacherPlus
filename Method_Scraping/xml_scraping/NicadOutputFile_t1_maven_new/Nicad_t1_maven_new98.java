// clone pairs:542:83%
// 881:maven/maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java

public class Nicad_t1_maven_new98
{
        protected void mergeModelBase_Properties( ModelBase target, ModelBase source, boolean sourceDominant,
                                                  Map<Object, Object> context )
        {
            Properties merged = new Properties();
            if ( sourceDominant )
            {
                merged.putAll( target.getProperties() );
                putAll( merged, source.getProperties(), CHILD_DIRECTORY_PROPERTY );
            }
            else
            {
                putAll( merged, source.getProperties(), CHILD_DIRECTORY_PROPERTY );
                merged.putAll( target.getProperties() );
            }
            target.setProperties( merged );
            target.setLocation( "properties",
                                InputLocation.merge( target.getLocation( "properties" ),
                                                     source.getLocation( "properties" ), sourceDominant ) );
        }
}