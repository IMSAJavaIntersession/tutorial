/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;

/**
 *
 * @author Andy
 */
public class OperatorStatement {
    public void precedence()
    {
        int i=0;
        i = i++;
        System.out.println(i);  // explain
        int x=1, y=1;
        boolean b = ++x > y++;
        System.out.println(b);  // explain
        boolean b1 = x>y++ || x+y%2>2; // what is y
        System.out.println(b1);  // explain
        
        boolean b2 = b || x++ == y;     //what is x
        System.out.println(b2+""+x);    // explain
        boolean b3 = !b || x++ == y;    //what is x
        System.out.println(b3+""+x);    // explain
        
        boolean b4 = !b && x++ > y;    //what is x
        System.out.println(b4+""+x);    // explain
        boolean b5 = b && x++ > y;     //what is x
        System.out.println(b5+""+x);    // explain
        
        System.out.println( b?b1?y++:0:1 );  // explain
        
        // logical operator below is not required by OCA, but nice to know
        x |= 4;
        System.out.println(4);  // explain
        x &= 4;
        System.out.println(4);  // explain
        x &= 8;
        System.out.println(4);  // explain
        
        // no need for type casting
        y *= 2L;
        //y = y*2L;   Problem
    }
    
    public String controlStatements()
    {
        long distance=20000;
        // how to improve below 6 lines with if else
        if ( distance > 2000)
            System.out.println("drive");
        if ( distance <= 200)
            System.out.println("walk");
        if ( distance <= 2000 && distance >200)
            System.out.println("run");
        
        // anything to fix below
        boolean weatherGood=false;
        if (weatherGood=true)
            System.out.println("go outside");
               
        // change follow 3 lines into 1 tertiary statement
        if (weatherGood)
            return "Good weather";
        return "Bad weather";
    }
    
    static final int two = 2;
    static final Integer three = new Integer(3);
    public void switchPractice()
    {
        // what types are supported
        // case statement requirement
        // what is break;
        // where to put defalt
        
        Integer one = new Integer(1);
        switch (one) {
            case 1:
                System.out.println(one);
            case two:  // must be a constant
                System.out.println(two);
            //case three:
                break;
        }
    }
    
    public void loops()
    {
        // which loop can declare variable
        
        // difference between while and do while loop
        
        // traditiona for vs. enhanced for loop
        
        /* any problem below
        do {
            int counter=0;
        } while (counter++<10);
        */
        
        for(;;)
            break;  // whay if break is change to continue
        
        // nexted loops, how to break or continue to utter loop
        
    }
    
    static public void main(String ...args)
    {
        new OperatorStatement().precedence();
    }
}
