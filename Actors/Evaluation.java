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
public class Evaluation 
{
       private static String evaldate;
       private static String preEntryCheck;
       private static String preStart;
       private static String movingForward;
       private static String movingBackward;
       private static String enterTraffic;
       private static String rightTurn;
       private static String leftTurn;
       private static String negotiatingIntersects;
       private static String changeLanes;
       private static String slowAndStop;
       private static String parkingAndSecure;
       private static String parkingOnGrades;
       private static String angleParking;
       private static String parallelParking;
       private static String turnAbouts;
       private static String assesHighway;
       private static String spaceManagement;
       private static String respondToTrafficControl;
       private static String respondToOthers;
       private static String passing;
       private static String commentaryDriving;
       private static String speed;
       private static String drivingApprConditions;
       private static String adverseWeather;
       private static String nightDriving;
       private static boolean pass;
       private static boolean fail;
       
       
       public static String getEvalDate()
       {
           return evaldate;
       }
       
       public void setEvalDate(String evaldate)
       {
           evaldate = evaldate;
       }
       
       public static String getPreEntryCheck()
       {
           return preEntryCheck;
       }
        
       public void setPreEntryCheck(String preentry)
       {
           preEntryCheck = preentry;
       }      
       public static String getpreStart()
       {
           return preStart;
       }
        
       public void setpreStart(String prestart)
       {
           preStart = prestart;
       }  
       
       public static String getmovingForward()
       {
           return movingForward;
       }
        
       public void setmovingForward(String movingforward)
       {
           movingForward = movingforward;
       }  
       
       public static String getmovingBackward()
       {
           return movingBackward;
       }
        
       public void setmovingBackward(String movingbackward)
       {
           movingBackward = movingbackward;
       }  
       
       public static String getenterTraffic()
       {
           return enterTraffic;
       }
        
       public void setenterTraffic(String entertraffic)
       {
           enterTraffic = entertraffic;
       }  
       
       public static String getrightTurn()
       {
           return rightTurn;
       }
        
       public void setrightTurn(String rightturn)
       {
           rightTurn = rightturn;
       }  
 
       public static String getleftTurn()
       {
           return leftTurn;
       }
        
       public void setleftTurn(String leftturn)
       {
           leftTurn = leftturn;
       } 
       
       public static String getnegotiatingIntersects()
       {
           return negotiatingIntersects;
       }
        
       public void setnegotiatingIntersects(String negotiatingintersects)
       {
           negotiatingIntersects = negotiatingintersects;
       }  
              
       public static String getchangeLanes()
       {
           return changeLanes;
       }
        
       public void setchangeLanes(String changelanes)
       {
           changeLanes = changelanes;
       }  
       
       public static String getslowAndStop()
       {
           return slowAndStop;
       }
        
       public void setslowAndStop(String slowandStop)
       {
           slowAndStop = slowandStop;
       }  
       
       public static String getparkingAndSecure()
       {
           return parkingAndSecure;
       }
        
       public void setparkingAndSecure(String parkingandSecure)
       {
           parkingAndSecure = parkingandSecure;
       }  
       
       public static String getparkingOnGrades()
       {
           return parkingOnGrades;
       }
        
       public void setparkingOnGrades(String parkingonGrades)
       {
           parkingOnGrades = parkingonGrades;
       }  
       
       public static String getangleParking()
       {
           return angleParking;
       }
        
       public void setangleParking(String angleparking)
       {
           angleParking = angleparking;
       }  
       
       public static String getparallelParking()
       {
           return parallelParking;
       }
        
       public void setparallelParking(String parallelparking)
       {
           parallelParking = parallelparking;
       }  
       
       public static String getturnAbouts()
       {
           return turnAbouts;
       }
        
       public void setturnAbouts(String turnabouts)
       {
           turnAbouts = turnabouts;
       }  
       
       public static String getassesHighway()
       {
           return assesHighway;
       }
        
       public void setassesHighway(String asseshighway)
       {
           assesHighway = asseshighway;
       }  
       
       public static String getspaceManagement()
       {
           return spaceManagement;
       }
        
       public void setspaceManagement(String spacemanagement)
       {
           spaceManagement = spacemanagement;
       }  
       
       public static String getrespondToTrafficControl()
       {
           return respondToTrafficControl;
       }
        
       public void setrespondToTrafficControl(String respondtoTrafficControl)
       {
           respondToTrafficControl = respondtoTrafficControl;
       }  
       
       public static String getrespondToOthers()
       {
           return respondToOthers;
       }
        
       public void setrespondToOthers(String respondtoOthers)
       {
           respondToOthers = respondtoOthers;
       }  
       
       public static String getpassing()
       {
           return passing;
       }
        
       public void setpassing(String passin)
       {
           passing = passin;
       }  
       
       public static String getcommentaryDriving()
       {
           return commentaryDriving;
       }
        
       public void setcommentaryDriving(String commentarydriving)
       {
           commentaryDriving = commentarydriving;
       }  
       
       public static String getspeedpoints()
       {
           return speed;
       }
        
       public void setspeedpoints(String speedpoints)
       {
           speed = speedpoints;
       }  
       
       public static String getdrivingApprConditions()
       {
           return drivingApprConditions;
       }
        
       public void setdrivingApprConditions(String drivingapprConditions)
       {
           drivingApprConditions = drivingapprConditions;
       } 
       
       public static String getadverseWeather()
       {
           return adverseWeather;
       }
        
       public void setadverseWeather(String adverseweather)
       {
           adverseWeather = adverseweather;
       }  
       
       public static String getnightDriving()
       {
           return nightDriving;
       }
        
       public void setnightDriving(String nightdriving)
       {
           nightDriving = nightdriving;
       }  
       
       public static boolean getHasPassed()
       {
           return pass;
       }
        
       public void setHasPassed(boolean passed)
       {
           pass = passed;
       }  
       public static boolean getHasFailed()
       {
           return fail;
       }
        
       public void setHasFailed(boolean failed)
       {
           fail = failed;
       }  
       
}
