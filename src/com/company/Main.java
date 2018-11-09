package com.company;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    throws IOException
    {
        Scanner sf = new Scanner(new File("C:\\Users\\bryce_000\\IdeaProjects\\twp-read-this-2018-bps24\\src\\Imports.txt"));
        int maxIndx = -1;
        String text[] = new String[1000];
        Student [] a = new Student[50];
        String fir=null;
        String las=null;
        String ave1=null;
        String abs1=null;
        int ave=0;
        int abs=0;
        String control=1;

        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( ) ;
        }

        sf.close( );

        for (int i=0;i<maxIndx;i++)
        {
           Scanner sf2 = new Scanner(text[i+1]);
           sf2.useDelimiter("\t");

            fir=sf2.next();
            las=sf2.next();
            ave1=sf2.next();
            abs1=sf2.next();

            ave1=ave1.substring(0,ave1.length()-1);

            ave=Integer.valueOf(ave1);
            abs=Integer.valueOf(abs1);

           a[i]=new Student(fir,las,ave,abs);
        }

        System.out.println("Class Average:" + Student.classAve);
        System.out.println("Number of A's: " + Student.as);
        System.out.println("Number of B's: " + Student.bs);
        System.out.println("Number of C's: " + Student.cs);
        System.out.println("Number of D's: " + Student.ds);
        System.out.println("Number of F's: " + Student.fs);

        while(control!="0")
        {
            Scanner kb= new Scanner(System.in);
            System.out.println("Would you like to search for a student? ");
            System.out.println("Enter a student's first name or enter 0 to exit");
            kb.next()=control;
            
        }
    }
}
