// clone pairs:2725:90%
// 3212:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/FileIO.java

public class Nicad_t1_beam492
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ReadableFile that = (ReadableFile) o;
      return Objects.equal(metadata, that.metadata) && compression == that.compression;
    }
}