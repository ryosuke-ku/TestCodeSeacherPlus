// clone pairs:1026:90%
// 1652:kylin/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/lookup/LookupTableToHFileJob.java

public class Nicad_t1_kylin174
{
    private byte[][] getSplitsByShardNum(int shardNum) {
        byte[][] result = new byte[shardNum - 1][];
        for (int i = 1; i < shardNum; ++i) {
            byte[] split = new byte[RowConstants.ROWKEY_SHARDID_LEN];
            BytesUtil.writeUnsigned(i, split, 0, RowConstants.ROWKEY_SHARDID_LEN);
            result[i - 1] = split;
        }
        return result;
    }
}