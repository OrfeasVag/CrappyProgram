/** Orfeas Vagelakis 
**/
//libraries

import java.util.Scanner;
public class inp 

{
//-------------------------------------------------------------------------------------------------
	public static int readInt()
	 {
		 Scanner a = new Scanner(System.in);
		 return a.nextInt();
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static double readDouble()
	 {
		 Scanner a = new Scanner(System.in);
		 return a.nextDouble();
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static String readString()
	 {
		 Scanner a = new Scanner(System.in);
		 return a.nextLine();
	 }
//-------------------------------------------------------------------------------------------------	 
	 public static String swi()
	 {
		
		 System.out.print("Type what you would like to do : " );
		 Scanner a = new Scanner(System.in);
		 return a.next();
	 }
//-------------------------------------------------------------------------------------------------	 
}
	