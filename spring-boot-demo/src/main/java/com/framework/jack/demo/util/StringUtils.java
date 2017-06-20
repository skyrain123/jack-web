package com.framework.jack.demo.util;

/**
 * @author jack
 */
public class StringUtils {

    public static boolean equals(String value, String against) {
        if (value == null)
            return against == null;
        return value.equals(against);
    }
}
