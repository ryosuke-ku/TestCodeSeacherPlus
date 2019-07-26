//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/interpolation/StringSearchModelInterpolator.java
// clone pairs:383:82%
// 725:maven/maven-model-builder/src/main/java/org/apache/maven/model/interpolation/StringSearchModelInterpolator.java

public class Nicad_t1_maven_072671
{
        private static void evaluateArray( Object target, InterpolateObjectAction ctx )
        {
            int len = Array.getLength( target );
            for ( int i = 0; i < len; i++ )
            {
                Object value = Array.get( target, i );
                if ( value != null )
                {
                    if ( String.class == value.getClass() )
                    {
                        String interpolated = ctx.interpolate( (String) value );

                        if ( !interpolated.equals( value ) )
                        {
                            Array.set( target, i, interpolated );
                        }
                    }
                    else
                    {
                        ctx.interpolationTargets.add( value );
                    }
                }
            }
        }
}