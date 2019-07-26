// clone pairs:1255:100%
// 1104:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/util/FilePatternMatchingShardedFile.java

public class Nicad_t1_beam58
{
  List<String> readLines(Collection<Metadata> files) throws IOException {
    List<String> allLines = Lists.newArrayList();
    int i = 1;
    for (Metadata file : files) {
      try (Reader reader =
          Channels.newReader(FileSystems.open(file.resourceId()), StandardCharsets.UTF_8.name())) {
        List<String> lines = CharStreams.readLines(reader);
        allLines.addAll(lines);
        LOG.debug("[{} of {}] Read {} lines from file: {}", i, files.size(), lines.size(), file);
      }
      i++;
    }
    return allLines;
  }
}