package com.epam.utils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str) && NumberUtils.toDouble(str) > 0) {
            return true;
        } else {
            return false;
        }
    }
}