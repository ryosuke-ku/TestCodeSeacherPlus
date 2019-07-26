// clone pairs:379:100%
// 626:ant/src/main/org/apache/tools/ant/types/selectors/PresentSelector.java

public class Nicad_t1_ant_10015
{
    public void verifySettings() {
        if (targetdir == null) {
            setError("The targetdir attribute is required.");
        }
        if (map == null) {
            if (mapperElement == null) {
                map = new IdentityMapper();
            } else {
                map = mapperElement.getImplementation();
                if (map == null) {
                    setError("Could not set <mapper> element.");
                }
            }
        }
    }
}