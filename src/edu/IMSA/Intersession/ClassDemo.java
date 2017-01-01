/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;  // must be before imports and class if present

import java.util.*;             // must be before class and after package if present

/**
 *
 * @author WXU
 */
public class ClassDemo {  // public class must be the filename, one per file
    static final int totalStudents=10;  // class scope
    
    public ClassDemo()
    {
        System.out.println("ClassDemo constructor "+studentsToday);
        studentsToday=0;
    }
    
    public void ClassDemo()
    {
        System.out.println("ClassDemo constructor imposter"+studentsToday);        
    }
    
    int studentsToday;
    {
        System.out.println("ClassDemo instance initializer block "+studentsToday);
        studentsToday=-1;
    }
    public boolean equals(Object right)  // Object is a class every other java class inherit from
    {
        if (right==null || !(right instanceof ClassDemo) )
            return false;
        ClassDemo otherDemo =(ClassDemo)right;
        return studentsToday==otherDemo.studentsToday;
    }
    public void addStudent()
    {
        studentsToday++;
    }
    
    public void primitiveTypeExercise()
    {
        // practice to understand the difference of each type
        // what is the order of automatic type conversion
        // what is suffix f or L used for, e.g. 6L, 5.0f
        // format for diffenr type of integer base, octal, hexadecimal, binary
        // negative integer and Two's Complement, http://www.cs.cornell.edu/~tomf/notes/cps104/twoscomp.html
    }
    
    // follow camelCase rule for variables and methods, CamelCase rule for class name
    // use all capital letters for constant values (static final), avoid magic number
    public void identifierAndDecalration()
    {
        // practice how to declare and initialize variables
        
        // rule for varaible name, [_$A-Za-z]+[_$A-Za-z0-9]*
    }
    
    static public void passByValue(int score, String grade)
    {
        score = 99;
        grade = "A+";
        System.out.println("moodified score is "+score+" grade " +grade);
    }
    
    //public static void main(String ...args)
    //static public final void main(String[] main)
    //final static public void main(String[] main)
    public static void main(String[] main) // all 4 variations works, this one is canonical form
    {
        System.out.println("total "+totalStudents);
        System.out.println("arg lenght: "+main.length);
        
        ClassDemo demo; // demo is reference type, local scope, uninitialized
        demo = new ClassDemo(); // create a new object, assigned to demo, watch initialization sequence
        ClassDemo demo2=new ClassDemo();
        System.out.println("compare reference "+(demo==demo2));
        System.out.println("compare value "+(demo.equals(demo2)));
        demo2.addStudent();
        System.out.println("compare value "+(demo.equals(demo2)));
        ClassDemo demo3 = demo;
        demo = null;    // any obect is eligible for garbage collection?
        demo2 = demo;   // how about now
        demo3=demo2;    // how about now
        
        {   // test block scope, variable initialization, and function call with parameters
            int score;
            score = 88; // does it compile if this line is commented out (compare to instance variablen initialization)
            String grade ="B+";
            passByValue(score, grade);
            System.out.println("Final score is "+score+" grade " +grade);
        }
        // does it compile if following statement is uncommented
        // System.out.println("Final score is "+score+" grade " +grade);
        
        String pattern = "[_$A-Za-z]+[_$A-Za-z0-9]*";
        System.out.println("$123a".matches(pattern));
        System.out.println("1$123a".matches(pattern));
    }
   
    protected void finalize() // no practical use
    {
        System.out.println(" called 0 or 1 time by garbage collector");
    }
}

class Student {
    
}
class Attendance  // extra none public class is OK
{
    
}