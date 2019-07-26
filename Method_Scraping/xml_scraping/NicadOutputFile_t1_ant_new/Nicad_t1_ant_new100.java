// clone pairs:592:90%
// 900:ant/src/main/org/apache/tools/ant/taskdefs/War.java

public class Nicad_t1_ant_new100
{
    public void setWebxml(File descr) {
        deploymentDescriptor = descr;
        if (!deploymentDescriptor.exists()) {
            throw new BuildException("Deployment descriptor:  does not exist.",
                deploymentDescriptor);
        }

        // Create a ZipFileSet for this file, and pass it up.
        ZipFileSet fs = new ZipFileSet();
        fs.setFile(deploymentDescriptor);
        fs.setFullpath(XML_DESCRIPTOR_PATH);
        super.addFileset(fs);
    }
}