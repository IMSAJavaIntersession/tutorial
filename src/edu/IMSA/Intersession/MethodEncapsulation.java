/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;  // for static members
/**
 *
 * @author WXU
 */

class MethodDeclaration {
    void shortest(){}
    
    // 
    // optional specifiers and access modifier should be before return type
    static final synchronized strictfp public boolean longest(int i, 
            String ...varargs) throws IOException
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
    {
        System.out.println("initializer "+count+" max "+MAX_COUNT);
    }
    public int nextCount()
    {
        return ++count;
    }
    static {// static initializer for constant (but not in both places)
        MAX_COUNT=999999999;
        System.out.println("static initializer "+count+" max "+MAX_COUNT);
    }
    
    // pass by value
    static public void passByValue(String str, StringBuilder build)
    {
        str += "NOCHANGE";
        build.append("CHANGED");
    }
            
    // overload rules, different param types
    // return type, modifiers can vary but cannot be the only differences
    public void overload(int i){
        System.out.println("int overload "+i);
    }
    public void overload(Integer i){
        System.out.println("Integer overload "+i);
    }
    public void overload(Object o){
        System.out.println("Object overload "+o);
    }
    public void overload(Double i){
        System.out.println("Double overload "+i);
    }
    public int  overload(){return 0;}
    //public int overload(int i){return 0;}
    //static final public void overload(int i) throws Exception{}
    
    static {
        new MethodEncapsulation(10).nextCount();
    }
       
    MethodEncapsulation()
    {
        this(0);
        System.out.println("default constructor "+count);
    } 
    MethodEncapsulation(int c)
    {
        System.out.println("constructor "+c);
        count = c;
    }
    public static void main(String[] args)
    {
        String str = "value ";
        StringBuilder build = new StringBuilder("value ");
        passByValue(str, build);
        System.out.println(str);
        System.out.println(build);
        
        MethodEncapsulation over = new MethodEncapsulation();
        // overload method calling match rule
        over.overload(10L);// long can match double or Long, but not Double
        short sInt = 11;
        over.overload(sInt);
        over.overload(new Float(12.0f));
        over.overload(13.0);
        over.overload(14.0f);
        
        // constructor overload follow similar rules
        // default constructor
        // call this(...) to reuse code for constructors
        
        // object order of initialization
        
        // JavaBeans, setter/getter convention
        // Encapsulation, immutable
        
        // lamda full syntax: (Type var,...)->{ //normal code block;}
        // left side can be simplidies as (), var, (var1, var2)
        // right side can be simplified if there is only one statement
        Predicate<String> p = s->s.isEmpty();
        List<String> strings = new ArrayList<>(
                Arrays.asList(new String[]{"1","22",""}));
        strings.removeIf(p);
        System.out.println(strings);
    }
}
