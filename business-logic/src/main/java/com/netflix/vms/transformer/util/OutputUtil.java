package com.netflix.vms.transformer.util;

import com.netflix.vms.transformer.hollowinput.DateHollow;
import com.netflix.vms.transformer.hollowoutput.Date;
import com.netflix.vms.transformer.hollowoutput.Integer;

public class OutputUtil {
    public static final long FIVE_SECOND_MILLIS = 5000l;

    public static Integer getNullableInteger(int value) {
        if (java.lang.Integer.MIN_VALUE == value) return null;

        return new Integer(value);
    }

    public static int minValueToZero(int value) {
        if (java.lang.Integer.MIN_VALUE == value) return 0;

        return value;
    }

    public static long round(final long date, final long roundByMillis) {
        return (date / roundByMillis) * roundByMillis;
    }

    public static long getRoundedTimeStamp(long value) {
        return round(value, FIVE_SECOND_MILLIS);
    }

    public static Date getRoundedDate(long value) {
        return new Date(getRoundedTimeStamp(value));
    }

    public static Date getRoundedDate(DateHollow dateHollow) {
        return dateHollow != null ? getRoundedDate(dateHollow._getValue()) : null;
    }
}