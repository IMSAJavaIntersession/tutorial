/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;

import java.io.IOException;
import static java.util.Arrays.asList;  // for static members
/**
 *
 * @author WXU
 */

class MethodDeclaration {
    void shortest(){}
    
    // 
    // optional specifiers and access modifier should be before return type
    static final synchronized strictfp public boolean longest(int i, String ...varargs) throws IOException
    {
        // abstract conflict static
        
        if (true){
            return false;
        }
        return true; // does code compile if this line is commented out
    }
}

// compare all report methods below and explain where it cannot call student methods
class StudentIMSA extends Student  // 
{
    public void report()
    {
        //studentID=0;
        setID(1);
        setGrade("A");
        System.out.println("StudentIMSA grade "+getGrade());
    }
    
    public void report(Student student)
    {
        student.setID(2);
        student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
}

class StudentIMSA2 extends tutorial.Student  // 
{
    public void report()
    {
        //setID(1);  // default method cannot be access 
        setGrade("A");
        System.out.println("StudentIMSA grade "+getGrade());
    }
    
    public void report(tutorial.Student student)
    {
        //student.setID(2);
        //student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
    
    public void report(StudentIMSA2 student)
    {
        //student.setID(2);
        student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
}

public class MethodEncapsulation {
    
    // access modifier
    // private: within the same class
    // default(no access modifier): + classes in same package
    // protected: + derived classes even if there are not in same packages
    // public: anywhere
    // different view when one class call method in another class
    //    classes in same package can access all except private members
    //    classes in different packages can only access public memebers, 
    //      except protected member can be accessed by derived classes
    public void report(Student student)
    {
        student.setID(2);
        student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
    
    // tutorial.Student must be a public class
    public void report(tutorial.Student student)
    {
        //student.setID(2);
        //student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
    public void report(StudentIMSA2 student)
    {
        //student.setID(2);
        //student.setGrade("A+");
        System.out.println("StudentIMSA grade "+student.getGrade());
    }
    
    // static vs instance member
    static int count=0;
    static final int MAX_COUNT;//=999999999;
    public int nextCount()
    {
        return ++count;
    }
    static {  // static initializer can be used for constant (but not in both places)
        MAX_COUNT=999999999;
    }
    
    // pass by value
    static public void passByValue(String str, StringBuilder build)
    {
        str += "NOCHANGE";
        build.append("CHANGED");
    }
            
    // overload rules, different param types
    // return type, modifiers can vary but cannot be the only differences
    public void overload(int i){}
    public int overload(){return 0;}
    //public int overload(int i){return 0;}
    //static final public void overload(int i) throws Exception{}
    
    public static void main(String[] args)
    {
        String str = "value ";
        StringBuilder build = new StringBuilder("value ");
        passByValue(str, build);
        System.out.println(str);
        System.out.println(build);
    }
}
