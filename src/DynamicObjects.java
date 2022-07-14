import java.lang.reflect.Field;
import java.util.Arrays;

public class DynamicObjects {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> cls = Class.forName("TempStruct");
        Object clsInstance = cls.getDeclaredConstructor();
        Field[] objectFields = clsInstance.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(objectFields));

    }

    public static class TempStruct {
        private double tempValue;
        private String unitOfMeasurement;

        public TempStruct(double tempValue, String unitOfMeasurement) {
            this.tempValue = tempValue;
            this.unitOfMeasurement = unitOfMeasurement;
        }

    }
}
