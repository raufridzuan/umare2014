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

    //04 - Using Array
    String[] footerArray = { "Hello World!", " ", "--from UMARE 2014" } ;

    String footer = "";
    for( String each_string: footerArray )
    {
      footer += each_string;
    }
    System.out.println(footer);
  }
}
