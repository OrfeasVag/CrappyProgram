// Orfeas Vagelakis 
public class calculator extends service
{
//-------------------------------------------------------------------------------------------------
	public static void sum()
	{
		     outp.println("||Launching Summing Service.");
			 outp.println("Insert how many numbers you want to sum : ");
			 int num = inp.readInt();
			 int [] nums= new int [num];
		     int s=0;
			  for(int i=0;i<num;i++)
			  {
					   outp.println(" ");
					   outp.println("Insert Number("+(i+1)+"/" +(num)+") : ");
					   nums[i]=inp.readInt();
					   s=s+nums[i];
			  }
			  outp.println(" ");
			  outp.println("Result ");
			  for(int i=0;i<num;i++)
			  {
			   if(i==0){
			   System.out.print(nums[0]);
			   }
			   else
			   {
				   System.out.print(" + "+nums[i]);
			   }
			  }
			  System.out.println(" = "+s+".");
			  System.out.println("---------------------------------------------------------");
			  System.out.println("||Exiting Summing Service.");
	}
//-------------------------------------------------------------------------------------------------
    public static void multi()
	{
		     outp.println("||Launching Multiplication Service.");
			 outp.println("Insert how many numbers you want to Multiply : ");
			 int num = inp.readInt();
			 int [] nums= new int [num];
		     int s=1;
			  for(int i=0;i<num;i++)
			  {
					   outp.println(" ");
					   outp.println("Insert Number("+(i+1)+"/" +(num)+") : ");
					   nums[i]=inp.readInt();
					   s=s*nums[i];
			  }
			  outp.println(" ");
			  outp.println("Result : ");
			  for(int i=0;i<num;i++)
			  {
			   if(i==0){
			   System.out.print(nums[0]);
			   }
			   else
			   {
				   System.out.print(" * "+nums[i]);
			   }
			  }
			  System.out.println(" = "+s+".");
			  System.out.println("---------------------------------------------------------");
			  System.out.println("||Exiting Multiplication Service.");
//-------------------------------------------------------------------------------------------------			  
    }
   public static void help()
	{
	        outp.println("||Launching Calculator's Help Service.");
			outp.println(" ");
	    	outp.println("Type sum to insert and sum numbers."); 
            outp.println("Type multiply to insert and multiply numbers.");			
	        outp.println("Type exit to exit this program.");
	        outp.println("You can always type just the first letter of the command.");
	        outp.println("Example type n over name.");
	        outp.println("Supported Services sum ,multiply ,exit or back.");
			outp.println(" ");
	        outp.println("||Exiting Calculator's Help Service.");	
	}
//-------------------------------------------------------------------------------------------------			  
}
	