public class Nicad_1614
{
    public VersionRange cloneOf()
    {
        List<Restriction> copiedRestrictions = null;

        if ( restrictions != null )
        {
            copiedRestrictions = new ArrayList<>();

            if ( !restrictions.isEmpty() )
            {
                copiedRestrictions.addAll( restrictions );
            }
        }

        return new VersionRange( recommendedVersion, copiedRestrictions );
    }
}