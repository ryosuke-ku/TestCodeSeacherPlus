// clone pairs:5813:70%
// 7660:beam/sdks/java/extensions/protobuf/src/main/java/org/apache/beam/sdk/extensions/protobuf/ProtoCoder.java

public class Nicad_t1_beam_2nd1187
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