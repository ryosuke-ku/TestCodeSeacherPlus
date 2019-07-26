// clone pairs:1445:83%
// 1223:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/BoundedReadFromUnboundedSource.java

public class Nicad_t1_beam_new268
{
    private static long[] splitNumRecords(long numRecords, int numSplits) {
      long[] splitNumRecords = new long[numSplits];
      for (int i = 0; i < numSplits; i++) {
        splitNumRecords[i] = numRecords / numSplits;
      }
      for (int i = 0; i < numRecords % numSplits; i++) {
        splitNumRecords[i] = splitNumRecords[i] + 1;
      }
      return splitNumRecords;
    }
}