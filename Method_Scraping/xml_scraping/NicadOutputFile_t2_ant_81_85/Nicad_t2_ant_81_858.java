// clone pairs:512:83%
// 829:ant/src/main/org/apache/tools/ant/taskdefs/Replace.java

public class Nicad_t2_ant_81_858
{
        FileInput(File source) throws IOException {
            outputBuffer = new StringBuffer();
            buffer = new char[BUFF_SIZE];
            is = Files.newInputStream(source.toPath());
            try {
                reader = new BufferedReader(
                    encoding != null ? new InputStreamReader(is, encoding)
                        : new InputStreamReader(is));
            } finally {
                if (reader == null) {
                    is.close();
                }
            }
        }
}