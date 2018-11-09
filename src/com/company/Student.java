package com.company;

public class Student
{
    private String first;
    private String last;
    private int average;
    private int ab;
    public static double classAve;
    public int numofstudents;
    public double classTot=0;
    public static int as;
    public static int bs;
    public static int cs;
    public static int ds;
    public static int fs;

    public Student(String first, String last, int average, int ab)
    {
        this.first=first;
        this.last=last;
        this.average=average;
        this.ab=ab;

        classTot += average;
        numofstudents ++;
        classAve=classTot/numofstudents;

        if(average>=90)  as++;
        else if(average>=80) bs++;
        else if(average>=70)  cs++;
        else if(average>=60) ds++;
        else fs++;
    }

    public String getFirst(){ return first; }

    public String getLast() { return last; }

    public int getAverage() { return average; }

    public int getAb() { return ab; }

}
