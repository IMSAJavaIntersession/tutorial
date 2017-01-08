/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author WXU
 */

public class Student {
    private long studentID=-1;
    private String grade;
    
    void setID(long id) {
        studentID = id;
    }
    protected void setGrade(String g)
    {
        grade = g;
    }
    public String getGrade()
    {
        return grade;
    }
}

