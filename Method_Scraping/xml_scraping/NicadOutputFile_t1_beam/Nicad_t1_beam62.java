// clone pairs:1294:92%
// 1143:beam/runners/gearpump/src/main/java/org/apache/beam/runners/gearpump/translators/utils/TranslatorUtils.java

public class Nicad_t1_beam62
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      RawUnionValue that = (RawUnionValue) o;

      if (!unionTag.equals(that.unionTag)) {
        return false;
      }
      return value != null ? value.equals(that.value) : that.value == null;
    }
}