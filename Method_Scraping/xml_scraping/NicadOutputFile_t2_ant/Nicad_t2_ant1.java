// clone pairs:52:100%
// 93:ant/src/main/org/apache/tools/zip/ExtraFieldUtils.java

public class Nicad_t2_ant1
{
    public static byte[] mergeLocalFileDataData(ZipExtraField[] data) {
        final boolean lastIsUnparseableHolder = data.length > 0
                && data[data.length - 1] instanceof UnparseableExtraFieldData;
        int regularExtraFieldCount = lastIsUnparseableHolder ? data.length - 1 : data.length;

        int sum = WORD * regularExtraFieldCount;
        for (ZipExtraField element : data) {
            sum += element.getLocalFileDataLength().getValue();
        }

        byte[] result = new byte[sum];
        int start = 0;
        for (int i = 0; i < regularExtraFieldCount; i++) {
            System.arraycopy(data[i].getHeaderId().getBytes(),
                    0, result, start, 2);
            System.arraycopy(data[i].getLocalFileDataLength().getBytes(),
                    0, result, start + 2, 2);
            byte[] local = data[i].getLocalFileDataData();
            System.arraycopy(local, 0, result, start + WORD, local.length);
            start += (local.length + WORD);
        }
        if (lastIsUnparseableHolder) {
            byte[] local = data[data.length - 1].getLocalFileDataData();
            System.arraycopy(local, 0, result, start, local.length);
        }
        return result;
    }
}