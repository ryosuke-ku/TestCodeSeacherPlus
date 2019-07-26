// clone pairs:3770:90%
// 4553:beam/sdks/java/extensions/google-cloud-platform-core/src/main/java/org/apache/beam/sdk/extensions/gcp/util/gcsfs/GcsPath.java

public class Nicad_t1_beam_2nd649
{
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    GcsPath paths = (GcsPath) o;
    return bucket.equals(paths.bucket) && object.equals(paths.object);
  }
}