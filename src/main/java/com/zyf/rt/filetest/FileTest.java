package com.zyf.rt.filetest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileTest {

    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date();
        boolean b = d1.before(d2);
        System.out.println(b);
    }
}
