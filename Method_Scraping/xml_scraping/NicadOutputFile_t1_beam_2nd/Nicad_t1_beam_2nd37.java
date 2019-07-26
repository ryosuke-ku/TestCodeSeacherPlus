// clone pairs:866:80%
// 601:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/FileBasedSink.java

public class Nicad_t1_beam_2nd37
{
    final Coder<DestinationT> getDestinationCoderWithDefault(CoderRegistry registry)
        throws CannotProvideCoderException {
      Coder<DestinationT> destinationCoder = getDestinationCoder();
      if (destinationCoder != null) {
        return destinationCoder;
      }
      // If dynamicDestinations doesn't provide a coder, try to find it in the coder registry.
      @Nullable
      TypeDescriptor<DestinationT> descriptor =
          extractFromTypeParameters(
              this,
              DynamicDestinations.class,
              new TypeVariableExtractor<
                  DynamicDestinations<UserT, DestinationT, OutputT>, DestinationT>() {});
      try {
        return registry.getCoder(descriptor);
      } catch (CannotProvideCoderException e) {
        throw new CannotProvideCoderException(
            "Failed to infer coder for DestinationT from type "
                + descriptor
                + ", please provide it explicitly by overriding getDestinationCoder()",
            e);
      }
    }
}