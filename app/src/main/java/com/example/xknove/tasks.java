package com.example.xknove;

import java.util.Date;

public class tasks {
    public String task1;
    public String task2;
    public String task3;;
    public int tst1;
    public int tst2;
    public int tst3;



    public tasks() {}
    public tasks(String task1, int tst1, long date1, String task2, int tst2, long date2, String task3, int tst3, long date3, int priority, String taskmessage){
        this.task1 = task1;
        this.tst1 = tst1;

        this.task2 = task2;
        this.task3 = task3;
        this.tst2 = tst2;
        this.tst3 = tst3;

    }

    public String getTask1() {
        return task1;
    }

    public void setTask1(String task1) {
        this.task1 = task1;
    }

    public int getTst1() {
        return tst1;
    }

    public void setTst1(int tst1) {
        this.tst1 = tst1;
    }


    public String getTask2() {
        return task2;
    }

    public void setTask2(String task2) {
        this.task2 = task2;
    }

    public String getTask3() {
        return task3;
    }

    public void setTask3(String task3) {
        this.task3 = task3;
    }

    public int getTst2() {
        return tst2;
    }

    public void setTst2(int tst2) {
        this.tst2 = tst2;
    }


    public int getTst3() {
        return tst3;
    }

    public void setTst3(int tst3) {
        this.tst3 = tst3;
    }








}
