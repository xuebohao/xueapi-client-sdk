package com.xuebohao.xueapiclientsdk.utils;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Administrator
 */
public class TimeDifferenceCalculatorUtil {

    public static long calculateMinutesDifference(long timestamp1, long timestamp2) {
        Instant instant1 = Instant.ofEpochMilli(timestamp1);
        Instant instant2 = Instant.ofEpochMilli(timestamp2);

        Duration duration = Duration.between(instant1, instant2);

        return duration.toMinutes();
    }

}
