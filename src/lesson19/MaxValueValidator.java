package lesson19;

import data.MaxValue;

import java.lang.reflect.Field;

public class MaxValueValidator {
    public void validateMaxValue(Object obj) throws IllegalAccessException {
        final Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(MaxValue.class)) {
                final MaxValue annotation = field.getAnnotation(MaxValue.class);
                final int maxValue = annotation.value();
                int value = (int) field.get(obj);
                if (value > maxValue) {
                    throw new IllegalArgumentException("Value: " + value
                            + " is more than Maximum: " + maxValue);
                }
            }
        }
    }
}
