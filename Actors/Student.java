/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actors;

/**
 *
 * @author Gary Burch
 */
    public class Student
    {
       private static String name;
       private static String permitNumber;
       private static String birthdate;
       
       public static String getStudentName()
       {
           return name;
       }
       
       public void setStudentName(String studentname)
       {
           name = studentname;
       }
       
       public static String getPermitNumber()
       {
           return permitNumber;
       }
        
       public void setPermitNumber(String permitnumber)
       {
           permitNumber = permitnumber;
       }      
       public static String getDateOfBirth()
       {
           return birthdate;
       }
        
       public void setDateOfBirth(String dateofbirth)
       {
           birthdate = dateofbirth;
       }       
    }
