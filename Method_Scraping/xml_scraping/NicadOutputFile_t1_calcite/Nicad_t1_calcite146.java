// clone pairs:1436:80%
// 2420:calcite/core/src/main/java/org/apache/calcite/materialize/LatticeSuggester.java

public class Nicad_t1_calcite146
{
    TableRef tableRef(TableScan scan) {
      final TableRef r = tableRefs.get(scan.getId());
      if (r != null) {
        return r;
      }
      final LatticeTable t = space.register(scan.getTable());
      final TableRef r2 = new TableRef(t, tableRefs.size());
      tableRefs.put(scan.getId(), r2);
      return r2;
    }
}