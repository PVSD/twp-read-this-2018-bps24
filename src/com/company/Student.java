package com.company;

public class Student
{
    private String first;
    private String last;
    private int average;
    private int ab;

    public Student(String first, String last, int average, int ab)
    {
        this.first=first;
        this.last=last;
        this.average=average;
        this.ab=ab;
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast(Student a)
    {
        return a.last;
    }

    public int getAverage(Student a)
    {
        return a.average;
    }

    public int getAb(Student a)
    {
        return a.ab;
    }
}
