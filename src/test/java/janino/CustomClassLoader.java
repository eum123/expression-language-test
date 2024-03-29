package janino;

import java.io.FileInputStream;

public class CustomClassLoader extends ClassLoader {

    public CustomClassLoader() {
        super(CustomClassLoader.class.getClassLoader());
    }

    public  Class load(String className, String name) throws Exception {
        FileInputStream file = null;
        try {
            file = new FileInputStream(className);
            byte[] classByte = new byte[file.available()];
            file.read(classByte);

            return defineClass(name, classByte, 0, classByte.length);
        } catch(Exception ex) {
            throw new ClassNotFoundException();
        } finally {
            if(file != null) {
                file.close();
            }
        }

    }

    public void resolve(Class clazz) {
        super.resolveClass(clazz);
    }
}
