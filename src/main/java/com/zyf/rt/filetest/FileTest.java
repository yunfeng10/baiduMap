package com.zyf.rt.filetest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    public static void main(String[] args){
        SimpleDateFormat myFmt1=new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = new Date();
        String s = myFmt1.format(d);
        System.out.println(s);
    }
}
