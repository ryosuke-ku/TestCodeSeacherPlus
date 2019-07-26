// clone pairs:10:70%
// 14:ant/src/main/org/apache/tools/ant/filters/LineContains.java

public class Nicad_t1_ant_new4
{
    public int read() throws IOException {
        if (!getInitialized()) {
            initialize();
            setInitialized(true);
        }

        int ch = -1;

        if (line != null) {
            ch = line.charAt(0);
            if (line.length() == 1) {
                line = null;
            } else {
                line = line.substring(1);
            }
        } else {
            final int containsSize = contains.size();

            for (line = readLine(); line != null; line = readLine()) {
                boolean matches = true;
                for (int i = 0; i < containsSize; i++) {
                    final String containsStr = contains.elementAt(i);
                    matches = line.contains(containsStr);
                    if (!matches) {
                        if (this.matchAny) {
                            // this one didn't match, but we are expected to have
                            // any one of them match. so try next
                            continue;
                        } else {
                            // all were expected to match, but this one didn't.
                            // so no point checking the rest
                            break;
                        }
                    } else if (this.matchAny) {
                        // we were expected to match any of the contains
                        // and this one did. so no more checks needed
                        break;
                    }
                }
                if (matches ^ isNegated()) {
                    break;
                }
            }
            if (line != null) {
                return read();
            }
        }
        return ch;
    }
}