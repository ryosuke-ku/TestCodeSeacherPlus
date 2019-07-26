// clone pairs:6052:70%
// 8007:beam/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/meta/provider/kafka/BeamKafkaCSVTable.java

public class Nicad_t1_beam_2nd1243
{
    public PCollection<KV<byte[], byte[]>> expand(PCollection<Row> input) {
      return input.apply(
          "encodeRecord",
          ParDo.of(
              new DoFn<Row, KV<byte[], byte[]>>() {
                @ProcessElement
                public void processElement(ProcessContext c) {
                  Row in = c.element();
                  c.output(KV.of(new byte[] {}, beamRow2CsvLine(in, format).getBytes(UTF_8)));
                }
              }));
    }
}