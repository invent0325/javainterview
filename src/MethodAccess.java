import java.lang.reflect.Method;

public class MethodAccess {
    public static void main(String[] args) throws Exception {

        String className = "AC1";

       Class<?> c = Class.forName(className);

       Object o = c.getDeclaredConstructor().newInstance();
       Method m = c.getDeclaredMethod("message", null);
       m.setAccessible(true);
       m.invoke(o, (Object[]) null);
    }

      static class AC1 {
        private void display() {
            System.out.println("hello private");
        }
    }
}
