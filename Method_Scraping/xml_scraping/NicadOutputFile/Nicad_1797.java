public class Nicad_1797
{
    private boolean hasErrors( List<SettingsProblem> problems )
    {
        if ( problems != null )
        {
            for ( SettingsProblem problem : problems )
            {
                if ( SettingsProblem.Severity.ERROR.compareTo( problem.getSeverity() ) >= 0 )
                {
                    return true;
                }
            }
        }

        return false;
    }
}