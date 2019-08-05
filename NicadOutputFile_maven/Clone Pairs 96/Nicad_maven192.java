//726:maven/maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java
//None

public class Nicad_maven192
{
        private void evaluateArray( Object target )
            throws ModelInterpolationException
        {
            int len = Array.getLength( target );
            for ( int i = 0; i < len; i++ )
            {
                Object value = Array.get( target, i );
                if ( value != null )
                {
                    if ( String.class == value.getClass() )
                    {
                        String interpolated =
                            modelInterpolator.interpolateInternal( (String) value, valueSources, postProcessors,
                                                                   debugEnabled );

                        if ( !interpolated.equals( value ) )
                        {
                            Array.set( target, i, interpolated );
                        }
                    }
                    else
                    {
                        interpolationTargets.add( value );
                    }
                }
            }
}