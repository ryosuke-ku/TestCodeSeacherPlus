// clone pairs:6091:70%
// 8992:beam/sdks/java/extensions/protobuf/src/main/java/org/apache/beam/sdk/extensions/protobuf/ProtoCoder.java

public class Nicad_t1_beam1815
{
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof ProtoCoder)) {
      return false;
    }
    ProtoCoder<?> otherCoder = (ProtoCoder<?>) other;
    return protoMessageClass.equals(otherCoder.protoMessageClass)
        && Sets.newHashSet(extensionHostClasses)
            .equals(Sets.newHashSet(otherCoder.extensionHostClasses));
  }
}