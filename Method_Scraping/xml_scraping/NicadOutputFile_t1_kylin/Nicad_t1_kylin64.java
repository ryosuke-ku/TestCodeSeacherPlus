// clone pairs:500:76%
// 773:kylin/core-cube/src/main/java/org/apache/kylin/cube/CubeInstance.java

public class Nicad_t1_kylin64
{
    public static CubeInstance getCopyOf(CubeInstance cubeInstance) {
        CubeInstance newCube = new CubeInstance();
        newCube.setName(cubeInstance.getName());
        newCube.setSegments(cubeInstance.getSegments());
        newCube.setDescName(cubeInstance.getDescName());
        newCube.setConfig((KylinConfigExt) cubeInstance.getConfig());
        newCube.setStatus(cubeInstance.getStatus());
        newCube.setOwner(cubeInstance.getOwner());
        newCube.setCost(cubeInstance.getCost());
        newCube.setCreateTimeUTC(System.currentTimeMillis());
        newCube.updateRandomUuid();
        return newCube;
    }
}