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

    //03 - Using StringBuilder
    
    Calendar now   = Calendar.getInstance();
    int yearInt    = now.get(Calendar.YEAR);
    String yearStr = String.valueOf(yearInt); 
    String footer  = "--from UMARE " + yearStr;

    StringBuilder lineStrB = new StringBuilder("");
    lineStrB.append("Hello");
    lineStrB.append("World");
    lineStrB.append("!");
    lineStrB.append(" ");
    lineStrB.append(footer);
    
    System.out.println(lineStrB);
  }
}
