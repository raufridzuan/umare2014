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

    //05 - XOR obfuscation     
    int [] footerArray = { 9, 36, 45, 45, 46, 97, 22, 46, 51, 45, 37, 96, 97, 108, 108, 39, 51, 46, 44, 97, 20, 12, 0, 19, 4, 97, 115, 113, 112, 117 };
    
    int base = 1949;
    Calendar now   = Calendar.getInstance();
    int yearInt    = now.get(Calendar.YEAR);

    int key = yearInt - base;

    StringBuilder footer = new StringBuilder();
    for( int each_int: footerArray )
    {
      int i = each_int ^ key;
      char ch = (char) i;
      footer.append(Character.toString(ch));
    }
    System.out.println(footer);
  }
}
