public class Nicad_1982
{
    public void flush()
    {
        for ( CacheRecord record : cache.values() )
        {
            ClassRealm realm = record.getRealm();
            try
            {
                realm.getWorld().disposeRealm( realm.getId() );
            }
            catch ( NoSuchRealmException e )
            {
                // ignore
            }
        }
        cache.clear();
    }
}