/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author WXU
 */
public class CoreAPI {
    
    static public void arrays()
    {
        // create 2D array of varied column size
        
        // autoboxing of premitive types
        // == cannot compare different types such as String and String Builder
        // array length, ArrayList size()
        // binary search rules
        
        int[] num = {3,2,1};
        //List<Integer> numList = Arrays.asList(num);
        List numList = Arrays.asList(num);  // don't work either
        List<Integer> numList2 = Arrays.asList(3,2,1);
        System.out.println(numList+" "+numList.size());
        System.out.println(numList2+" "+numList2.size());
        for (Object i:numList)
            System.out.println(i);
        
        // convert list to array
        numList2 = new ArrayList<>(numList2);
        Integer[] numArr = numList2.toArray(new Integer[0]);
        numList2.remove(0);  // explain difference of two remove methods
        numList2.add(0);
        Integer[] numArr2 = numList2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(numArr2));  // explain
        numList2.add(null);
        for (Integer i:numList2)
            System.out.println(i);
        System.out.println(numList2);
        // is result different if below two lines are uncommented
        //for (int i:numList2)
            //System.out.println(i);
        
        // convert Array to list, can list change size?
        Integer[] num2 = {3,2,1};
        numList2 = Arrays.asList(num2);
        System.out.println(numList2+" "+numList2.size());
        num2[1]=4;
        System.out.println(numList2+" "+numList2.size());  // what is expected?
        numList2.set(1, 2);
        System.out.println(numList2+" "+numList2.size());   // predict outcome
        //numList2.add(5);
        System.out.println(numList2+" "+numList2.size());   // predict outcome before uncommenting it
    }
    
    public static void main(String args[])
    {
        int y=0; int x=5;
        String s = y+++"test";
        System.out.println(s+y);
        
        s += y+x;
        System.out.println(s);
        
        // list some know immutable classes
        // LocalDate, LocalTime, Period, format rules
        
        arrays();
    }
}
