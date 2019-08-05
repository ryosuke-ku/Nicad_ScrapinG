//1862:maven/maven-model-builder/src/main/java/org/apache/maven/model/building/FileModelSource.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/building/FileModelSourceTest.java

public class Nicad_maven805
{
    public boolean equals( Object obj ) 
    {
        if ( this == obj ) 
        {
            return true;
        }
        
        if ( !( obj instanceof FileModelSource ) ) 
        {
            return false;
        }
        FileModelSource other = ( FileModelSource ) obj;
        return getFile().equals( other.getFile() );
}