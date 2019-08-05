//1353:maven/maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java
//maven/maven-embedder/src/test/java/org/apache/maven/cli/MavenCliTest.java

public class Nicad_maven520
{
    static File resolveFile( File file, String workingDirectory )
    {
        if ( file == null )
        {
            return null;
        }
        else if ( file.isAbsolute() )
        {
            return file;
        }
        else if ( file.getPath().startsWith( File.separator ) )
        {
            // drive-relative Windows path
            return file.getAbsoluteFile();
        }
        else
        {
            return new File( workingDirectory, file.getPath() ).getAbsoluteFile();
        }
}