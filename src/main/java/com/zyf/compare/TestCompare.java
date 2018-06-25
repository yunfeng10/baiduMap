package com.zyf.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class TestCompare {

    public static void main(String[] args){
       /* String ipAddress = "2031:0000:1F1F:0000:0000:0100:11A0:ADDF";
        boolean ret = false;
        if( ( ipAddress.split( ":" ).length - 1 ) <= 7 ){
            if( ipAddress.indexOf( "::" ) > 0 ){
                //跳段
                ret = Pattern.compile("^([\\da-f]{1,4}(:|::)){1,6}[\\da-f]{1,4}$").matcher( ipAddress ).find();
            }else{
                ret = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$").matcher( ipAddress ).find();
            }
        }

        System.out.println( ret );*/

       String ipAddress="1111";
        boolean ret = false;
        ret = Pattern.compile("^([\\da-f]{1,4}){1,6}$").matcher( ipAddress ).find();
        System.out.println( ret );

    }
}
