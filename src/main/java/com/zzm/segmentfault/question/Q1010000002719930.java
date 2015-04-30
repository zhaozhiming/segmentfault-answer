package com.zzm.segmentfault.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1010000002719930 {
    public static void main(String[] args) {
        matchDateString("2015-4-30");
        matchDateString("2015-04-30");
        matchDateString("2015-02-20");
    }

    private static void matchDateString(String string) {
        Pattern pattern = Pattern.compile("(\\d){4}-(\\d){2}-(\\d){2}");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.find());
    }
}
