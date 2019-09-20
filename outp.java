/** Orfeas Vagelakis 
**/
//libraries

public class outp 	
{
//-------------------------------------------------------------------------------------------------	
	public static void printInt(int a)
	 {  System.out.println("---------------------------------------------------------");
		System.out.println(a);
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static void printDouble(double a)
	 {
		System.out.println("---------------------------------------------------------");
		System.out.println(a);
	 }
//-------------------------------------------------------------------------------------------------
	 public static void printString(String a)
	 {
		System.out.println("---------------------------------------------------------");
		System.out.println(a);	
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static void print(String a)
	 {
		System.out.println("---------------------------------------------------------");
		System.out.println(a);
	 }
//-------------------------------------------------------------------------------------------------
	 public static void println(String a)
	 {
		System.out.println("---------------------------------------------------------");
		System.out.println(a);
	 }
//-------------------------------------------------------------------------------------------------
	 //welcome
	 public static void welcome(String a)
	 {  System.out.println("---------------------------------------------------------");
		System.out.println("Welcome User "+a+" .");
	 }
//-------------------------------------------------------------------------------------------------
	 public static void name(String a)
	 {  System.out.println("---------------------------------------------------------");
		System.out.println("User's name has been updated : "+a+" .");	
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static void def() 
	 {
		 outp.println(" ");
	     outp.println("It seems like you inputted an invalid command");
	     outp.println("you can always type help  to launch the help service.");
	     outp.println(" ");
	 }
//-------------------------------------------------------------------------------------------------	 
}
	