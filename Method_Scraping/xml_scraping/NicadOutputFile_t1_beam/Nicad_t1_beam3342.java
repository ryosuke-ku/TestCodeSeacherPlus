// clone pairs:12542:90%
// 18249:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/FileIO.java

public class Nicad_t1_beam3342
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