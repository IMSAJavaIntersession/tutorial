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
public class ClassDesign extends ClassDemo {
    
    public ClassDesign()
    {
        System.out.println("ClassDesign constructor");
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
        new ClassDesign(); // constructor sequence for inheritance
    }
}
