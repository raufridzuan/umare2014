import java.util.Calendar;

class HelloWorld 
{
  public static void main(String[] args) 
  {
    // Objective:
    //   Basic data disassembly of same string output with different techniques.

    // umare@umare:~/codes/umare2014$ javac HelloWorld.java 
    // umare@umare:~/codes/umare2014$ java HelloWorld 
    // Hello world! --from UMARE 2014

    //02 - Using Calendar.Year 
    Calendar now   = Calendar.getInstance();
    int yearInt    = now.get(Calendar.YEAR);
    String yearStr = String.valueOf(yearInt); 
    String footer  = "--from UMARE " + yearStr;
    
    System.out.println("Hello world! --from UMARE " + yearStr);  
    
  }
}
