//12:maven/maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultModelPathTranslator.java
//None

public class Nicad_maven12
{
    public void alignToBaseDirectory( Model model, File basedir, ModelBuildingRequest request )
    {
        if ( model == null || basedir == null )
        {
            return;
        }

        Build build = model.getBuild();

        if ( build != null )
        {
            build.setDirectory( alignToBaseDirectory( build.getDirectory(), basedir ) );

            build.setSourceDirectory( alignToBaseDirectory( build.getSourceDirectory(), basedir ) );

            build.setTestSourceDirectory( alignToBaseDirectory( build.getTestSourceDirectory(), basedir ) );

            build.setScriptSourceDirectory( alignToBaseDirectory( build.getScriptSourceDirectory(), basedir ) );

            for ( Resource resource : build.getResources() )
            {
                resource.setDirectory( alignToBaseDirectory( resource.getDirectory(), basedir ) );
            }

            for ( Resource resource : build.getTestResources() )
            {
                resource.setDirectory( alignToBaseDirectory( resource.getDirectory(), basedir ) );
            }

            if ( build.getFilters() != null )
            {
                List<String> filters = new ArrayList<>( build.getFilters().size() );
                for ( String filter : build.getFilters() )
                {
                    filters.add( alignToBaseDirectory( filter, basedir ) );
                }
                build.setFilters( filters );
            }

            build.setOutputDirectory( alignToBaseDirectory( build.getOutputDirectory(), basedir ) );

            build.setTestOutputDirectory( alignToBaseDirectory( build.getTestOutputDirectory(), basedir ) );
        }

        Reporting reporting = model.getReporting();

        if ( reporting != null )
        {
            reporting.setOutputDirectory( alignToBaseDirectory( reporting.getOutputDirectory(), basedir ) );
        }
}