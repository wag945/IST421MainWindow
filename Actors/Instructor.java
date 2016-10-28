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
public class Instructor 
{
       private static String name;
       private static String IDNumber;
       
       public static String getInstructorName()
       {
           return name;
       }
       
       public void setInstructorName(String instructorname)
       {
           name = instructorname;
       }
       
       public static String getIDNumber()
       {
           return IDNumber;
       }
        
       public void setIDNumber(String idnumber)
       {
           IDNumber = idnumber;
       }      
   
}
