import java.io.*;
import java.util.Scanner;
import java.util.UUID;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Main
{
  
  public static final void main(String args[])
  {
    
    // generate random UUIDs

    UUID idOne = UUID.randomUUID();
    
    log("UUID One: " + idOne);
    
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    name=sc.next();
      
    System.out.println("Your name is:");
    base(name);
    // base(idOne);

     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
     LocalDateTime now = LocalDateTime.now();
     System.out.println("Current Time is:");   
     System.out.println(dtf.format(now));  
  
  }
  
  public static void log(Object object)
{
      System.out.println("Your unique id is:");
      System.out.println( String.valueOf(object) );    
}
public static void base(Object obj1)
{
   // System.out.println("Your name is:");
      System.out.println( String.valueOf(obj1) );
   // System.out.println("Your unique id is:");
    
      
    
}
}  

