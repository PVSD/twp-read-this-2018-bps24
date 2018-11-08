package com.company;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    throws IOException,NoSuchElementException

    {
        Scanner sf = new Scanner(new File("C:\\Users\\bryce_000\\IdeaProjects\\twp-read-this-2018-bps24\\src\\Imports.txt"));
        int maxIndx = -1;
        String text[] = new String[1000];
        Student [] a = new Student[50];
        String fir=null;
        String las=null;
        int ave=0;
        int abs=0;

        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( ) ;
        }

        sf.close( );

        for (int i=0;i<=maxIndx;i++)
        {
           Scanner sf2 = new Scanner(text[i+1]).useDelimiter("\\s*");
           fir=sf2.next();
           //las=sf2.next();
           //ave=sf2.nextInt();
           //abs=sf2.nextInt();

           a[i]=new Student(fir,"as",1,2);
        }

        System.out.println(a[4].getFirst());
    }
}
