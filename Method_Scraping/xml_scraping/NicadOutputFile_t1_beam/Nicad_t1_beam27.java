// clone pairs:619:70%
// 470:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/util/FilePatternMatchingShardedFile.java

public class Nicad_t1_beam27
{
  public List<String> readFilesWithRetries(Sleeper sleeper, BackOff backOff)
      throws IOException, InterruptedException {
    IOException lastException = null;

    do {
      try {
        Collection<Metadata> files = FileSystems.match(filePattern).metadata();
        LOG.debug(
            "Found file(s) {} by matching the path: {}",
            files.stream()
                .map(Metadata::resourceId)
                .map(ResourceId::getFilename)
                .collect(Collectors.joining(",")),
            filePattern);
        if (files.isEmpty()) {
          continue;
        }
        // Read data from file paths
        return readLines(files);
      } catch (IOException e) {
        // Ignore and retry
        lastException = e;
        LOG.warn("Error in file reading. Ignore and retry.");
      }
    } while (BackOffUtils.next(sleeper, backOff));
    // Failed after max retries
    throw new IOException(
        String.format("Unable to read file(s) after retrying %d times", MAX_READ_RETRIES),
        lastException);
  }
}