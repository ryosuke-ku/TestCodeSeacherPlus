// clone pairs:616:70%
// 467:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/util/NumberedShardedFile.java

public class Nicad_t1_beam25
{
  public List<String> readFilesWithRetries(Sleeper sleeper, BackOff backOff)
      throws IOException, InterruptedException {
    IOException lastException = null;

    do {
      try {
        // Match inputPath which may contains glob
        Collection<Metadata> files =
            Iterables.getOnlyElement(FileSystems.match(Collections.singletonList(filePattern)))
                .metadata();

        LOG.debug("Found {} file(s) by matching the path: {}", files.size(), filePattern);

        if (files.isEmpty() || !checkTotalNumOfFiles(files)) {
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