package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String line = null;

        File students = new File("C:\\Users\\bs482\\IdeaProjects\\twp-read-this-2018-bps24\\src\\Imports.txt");
        Scanner reader = new Scanner(students);

       try
       {
           FileReader fileReader = new FileReader(students);
           BufferedReader bufferedReader = new BufferedReader(students);
           while ((line = bufferedReader.readLine()) != null)
       }

    }
}
