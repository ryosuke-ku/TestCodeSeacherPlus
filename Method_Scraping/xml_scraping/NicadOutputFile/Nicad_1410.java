public class Nicad_1410
{
    private boolean validateIdWithWildcards( String fieldName, ModelProblemCollector problems, Severity severity,
                                             Version version, String id, String sourceHint,
                                             InputLocationTracker tracker )
    {
        if ( !validateStringNotEmpty( fieldName, problems, severity, version, id, sourceHint, tracker ) )
        {
            return false;
        }
        else
        {
            if ( !isValidIdWithWildCards( id ) )
            {
                addViolation( problems, severity, version, fieldName, sourceHint,
                              "with value '" + id + "' does not match a valid id pattern.", tracker );
                return false;
            }
            return true;
        }
    }
}