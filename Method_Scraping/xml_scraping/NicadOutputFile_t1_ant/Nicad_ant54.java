// clone pairs:315:86%
// 510:ant/src/main/org/apache/tools/ant/taskdefs/optional/junitlauncher/confined/JUnitLauncherTask.java

public class Nicad_ant54
{
        protected synchronized Class<?> loadClass(String classname, boolean resolve)
                throws ClassNotFoundException {
            Class<?> theClass = findLoadedClass(classname);
            if (theClass != null) {
                return theClass;
            }
            final String packageName = classname.substring(0, classname.lastIndexOf('.'));
            if (packageName.equals("org.apache.tools.ant.taskdefs.optional.junitlauncher")) {
                theClass = findClass(classname);
                if (resolve) {
                    resolveClass(theClass);
                }
                return theClass;
            }
            return super.loadClass(classname, resolve);
        }
}