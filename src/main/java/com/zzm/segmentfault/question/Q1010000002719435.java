package com.zzm.segmentfault.question;

import org.joda.time.DateTime;
import java.sql.Timestamp;

public class Q1010000002719435 {

    public static void main(String[] args) {
        String timeStampString = "2014-11-11";
        DateTime dateTime = DateTime.parse(timeStampString);
        Timestamp timestamp = new Timestamp(dateTime.getMillis());
        System.out.println(timestamp);
    }
}
