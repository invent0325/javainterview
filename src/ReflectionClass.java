import org.jetbrains.annotations.Contract;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionClass {
    public static void main(String[] args) throws NoSuchFieldException {

        Test obj = new Test("Bulgar", "Pulsar", "India");
        Class<? extends Test> cls = obj.getClass();

        System.out.println(cls);

        System.out.println("The name of class is " + cls.getName());
        System.out.println(Arrays.toString(cls.getDeclaredFields()));
        System.out.println(Arrays.toString(cls.getDeclaredMethods()));
        System.out.println(cls.equals(obj));
        System.out.println(Constructor.PUBLIC);
        System.out.println(Constructor.DECLARED);
    }
        static class Test {
            public String districtName;
            private String stateName;
            private String countryName;

            @Contract(pure = true)
            public Test() {
            }

            public Test(String districtName, String stateName, String countryName) {
                this.districtName = districtName;
                this.stateName = stateName;
                this.countryName = countryName;
            }

            public void method1()
            {
                System.out.println("The string is " + districtName);
                System.out.println();
            }

            public void method2(int n)
            {
                System.out.println("The number is " + stateName);
            }

            private void method4()
            {
                System.out.println("The number is " + countryName);
            }

            private void method3()
            {
                System.out.println("Private method invoked");
            }
        }
    }