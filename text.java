// Orfeas Vagelakis 
public class text extends service 
{
	
//-------------------------------------------------------------------------------------------------	
	public static void help()
	{
	         outp.println("||Launching Text's Help Service.");
			 outp.println(" ");
			 outp.println("Type multiple to use the text service.");
			 outp.println("Type text to update your current text.");
			 outp.println("Type exit to exit Text's Service.");
	         outp.println("You can always type just the first letter of the command.");
	         outp.println("Example type m over multiple.");
	         outp.println("Supported Services multiple ,customize ,text ,exit.");
			 outp.println(" ");
	         outp.println("||Exiting Text's Help Service.");
	}
//-------------------------------------------------------------------------------------------------	
	public static void multiple(String text)
	{
		
		outp.println("||Launching Text's Multiple Copies Service.");
	    outp.println("How many times would you like to print your text?");
		int times=inp.readInt();
		outp.printString("");
         for(int i=0;i<times;i++)
			   {
				   outp.println(text);
			   }
        outp.println("||Exiting Text's Multiple Copies Service.");
	}
//-------------------------------------------------------------------------------------------------	
	public static String ntext()
	{
		outp.println("||Launching Text Update Service.");
	    outp.println("Please insert your text here: ");
	    String text=inp.readString();
		outp.println("Your text has been updated.");
		outp.println("||Exiting  Text Update Service.");
		return text;
	}
//-------------------------------------------------------------------------------------------------	
	public static String customize(String text) 
	{
	 outp.println("||Launching  Text Customizing Service.");
	 outp.println("! Under Construction !");
	 outp.println("||Exiting  Text Customizing Service.");	
	 return text;
	}
//-------------------------------------------------------------------------------------------------			  
}
	