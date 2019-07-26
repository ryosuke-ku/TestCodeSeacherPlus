// clone pairs:1514:75%
// 1299:beam/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/environment/DockerEnvironmentFactory.java

public class Nicad_t1_beam_new277
{
  public void DockerEnvironmentFactory(
      DockerCommand docker,
      GrpcFnServer<FnApiControlClientPoolService> controlServiceServer,
      GrpcFnServer<GrpcLoggingService> loggingServiceServer,
      GrpcFnServer<ArtifactRetrievalService> retrievalServiceServer,
      GrpcFnServer<StaticGrpcProvisionService> provisioningServiceServer,
      IdGenerator idGenerator,
      ControlClientPool.Source clientSource,
      boolean retainDockerContainer) {
    this.docker = docker;
    this.controlServiceServer = controlServiceServer;
    this.loggingServiceServer = loggingServiceServer;
    this.retrievalServiceServer = retrievalServiceServer;
    this.provisioningServiceServer = provisioningServiceServer;
    this.idGenerator = idGenerator;
    this.clientSource = clientSource;
    this.retainDockerContainer = retainDockerContainer;
  }
}