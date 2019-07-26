// clone pairs:1380:100%
// 1155:beam/runners/flink/1.5/src/main/java/org/apache/beam/runners/flink/translation/types/CoderTypeSerializer.java

public class Nicad_t1_beam_2nd67
{
  public T deserialize(DataInputView dataInputView) throws IOException {
    try {
      DataInputViewWrapper inputWrapper = new DataInputViewWrapper(dataInputView);
      return coder.decode(inputWrapper);
    } catch (CoderException e) {
      Throwable cause = e.getCause();
      if (cause instanceof EOFException) {
        throw (EOFException) cause;
      } else {
        throw e;
      }
    }
  }
}