/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;

/**
 *
 * @author WXU
 */
// class can be either public or default
// private class  test{}
// protected class  test{}
// All classes extends from Java.lang.Object
public class ClassDesign extends ClassDemo {
       
    public ClassDesign(String oneParam)
    {
        super();// must be first statement, compiler will insert if not present        
        System.out.println("ClassDesign constructor "+oneParam);
    }
    
    public boolean equals(Object right)  // Object is a class every other java class inherit from
    {
        if (right==null || !(right instanceof ClassDesign) )
            return false;
        ClassDesign otherDemo =(ClassDesign)right;
        return studentsToday==otherDemo.studentsToday;
    }
    
    
    public static void main(String[] main) 
    {
        new ClassDesign("test"); // constructor sequence for inheritance
        new ClassDesign2();
    }
}

class ClassDesign2 extends ClassDesign
{    
    public ClassDesign2()
    {
        super("call one param");  // does it compile if comment out
        System.out.println("ClassDesign2 constructor no argument");
    }
}
