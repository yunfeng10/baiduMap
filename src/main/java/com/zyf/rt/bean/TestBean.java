package com.zyf.rt.bean;

import com.zyf.rt.annotation.AnTest;

import java.util.Date;

public class TestBean {

    public static String tTest = "123";

    @AnTest(index = 0,format="asbc")
    private int f1;
    @AnTest(index = 1)
    private String f2;
    @AnTest(index = 2)
    private Date f3;

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public Date getF3() {
        return f3;
    }

    public void setF3(Date f3) {
        this.f3 = f3;
    }
}
