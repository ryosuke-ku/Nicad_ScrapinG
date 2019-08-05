//85:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven73
{
    protected void mergeModel_MailingLists( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        List<MailingList> src = source.getMailingLists();
        if ( !src.isEmpty() )
        {
            List<MailingList> tgt = target.getMailingLists();
            Map<Object, MailingList> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            for ( MailingList element : tgt )
            {
                Object key = getMailingListKey( element );
                merged.put( key, element );
            }

            for ( MailingList element : src )
            {
                Object key = getMailingListKey( element );
                if ( sourceDominant || !merged.containsKey( key ) )
                {
                    merged.put( key, element );
                }
            }

            target.setMailingLists( new ArrayList<>( merged.values() ) );
        }
}