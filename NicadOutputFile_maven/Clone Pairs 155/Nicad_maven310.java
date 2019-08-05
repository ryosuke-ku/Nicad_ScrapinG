//1021:maven/maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/inheritance/DefaultInheritanceAssemblerTest.java

public class Nicad_maven310
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