package com.main file; 
import org.springframework.context.Application Context;
 import org.springframework.context.support.Class PathXmlApplicationContext;
 public class MainApp
 {
 public static void main(String[] args)
 { 
ApplicationContext context = new 

ClassPathXmlApplicationContext("Beans.xml"); 

HelloWorld obj = (HelloWorld) 

context.getBean("helloWorld"); 
obj.getMessage(); 
} 
}