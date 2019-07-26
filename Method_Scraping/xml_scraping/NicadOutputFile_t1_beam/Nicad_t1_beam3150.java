// clone pairs:11065:70%
// 16483:beam/sdks/java/extensions/google-cloud-platform-core/src/main/java/org/apache/beam/sdk/extensions/gcp/util/gcsfs/GcsPath.java

public class Nicad_t1_beam3150
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