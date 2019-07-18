// clone pairs:872:81%
// 1471:maven/maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java

public class Nicad_211
{
        protected void mergePlugin( Plugin target, Plugin source, boolean sourceDominant, Map<Object, Object> context )
        {
            if ( source.isInherited() )
            {
                mergeConfigurationContainer( target, source, sourceDominant, context );
            }
            mergePlugin_GroupId( target, source, sourceDominant, context );
            mergePlugin_ArtifactId( target, source, sourceDominant, context );
            mergePlugin_Version( target, source, sourceDominant, context );
            mergePlugin_Extensions( target, source, sourceDominant, context );
            mergePlugin_Dependencies( target, source, sourceDominant, context );
            mergePlugin_Executions( target, source, sourceDominant, context );
        }
}