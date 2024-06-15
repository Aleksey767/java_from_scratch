package com.sazonau.annotations;

import java.lang.reflect.Field;

public class NullableWarningDetector {

    public static void detectNulls(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("The provided object is null");
        }

        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NullableWarning.class)) {
                try {
                    field.setAccessible(true);
                    if (field.get(o) == null) {
                        System.out.printf("\tVariable [%s] is null in [%s]!%n\n", field.getName(), o.getClass().getSimpleName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

