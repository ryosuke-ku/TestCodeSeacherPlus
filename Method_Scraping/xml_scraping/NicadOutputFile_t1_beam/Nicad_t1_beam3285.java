// clone pairs:12305:90%
// 17856:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/FileIO.java

public class Nicad_t1_beam3285
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