package com.skybrain.JUnitTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class time {
    public String sayTime(){
    	 
    	   Calendar cal = Calendar.getInstance();
    	   cal.add(Calendar.DATE, 0);
    	   Date date = cal.getTime();
    	   SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    	   String date1 = format1.format(date);
    	   Date inActiveDate = null;
    	   try{
    		   inActiveDate = format1.parse(date1);
    	   } catch (ParseException e1) {
    	       // TODO Auto-generated catch block
    	       e1.printStackTrace();
    	   }
    	   return date1;
    		  
//    	   String rightNow1 = rightNow.toString();
//    	   System.out.println(rightNow1);
//    	   return  rightNow1;
    }   
}
