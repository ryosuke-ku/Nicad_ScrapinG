//11:maven/maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java
//maven/maven-compat/src/test/java/org/apache/maven/project/path/DefaultPathTranslatorTest.java

public class Nicad_maven11
{
    public void unalignFromBaseDirectory( Model model, File basedir )
    {
        if ( basedir == null )
        {
            return;
        }

        Build build = model.getBuild();

        if ( build != null )
        {
            build.setDirectory( unalignFromBaseDirectory( build.getDirectory(), basedir ) );

            build.setSourceDirectory( unalignFromBaseDirectory( build.getSourceDirectory(), basedir ) );

            build.setTestSourceDirectory( unalignFromBaseDirectory( build.getTestSourceDirectory(), basedir ) );

            for ( Resource resource : build.getResources() )
            {
                resource.setDirectory( unalignFromBaseDirectory( resource.getDirectory(), basedir ) );
            }

            for ( Resource resource : build.getTestResources() )
            {
                resource.setDirectory( unalignFromBaseDirectory( resource.getDirectory(), basedir ) );
            }

            if ( build.getFilters() != null )
            {
                List<String> filters = new ArrayList<>();
                for ( String filter : build.getFilters() )
                {
                    filters.add( unalignFromBaseDirectory( filter, basedir ) );
                }
                build.setFilters( filters );
            }

            build.setOutputDirectory( unalignFromBaseDirectory( build.getOutputDirectory(), basedir ) );

            build.setTestOutputDirectory( unalignFromBaseDirectory( build.getTestOutputDirectory(), basedir ) );
        }

        Reporting reporting = model.getReporting();

        if ( reporting != null )
        {
            reporting.setOutputDirectory( unalignFromBaseDirectory( reporting.getOutputDirectory(), basedir ) );
        }
}