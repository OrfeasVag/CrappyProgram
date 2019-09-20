// Orfeas Vagelakis 
public class service extends mainp
{
//-------------------------------------------------------------------------------------------------
   public static void help()
   {
    outp.println("||Launching Help Service.");
	outp.println("Type text to use the text service.");
	outp.println("Type who to see your name.");
	outp.println("Type name to change the users name.");
	outp.println("Type exit to exit this program.");
	outp.println("You can always type just the first letter of the command.");
	outp.println("Example type n over name.");
	outp.println("Supported Services text ,name ,help ,exit or back.");
	outp.println(" ");
	outp.println("||Exiting Help Service.");
	
   }
//-------------------------------------------------------------------------------------------------
  public static void loc(String loc)
  {
    outp.printString("Your Current location is : "+loc+" .");
  } 
//-------------------------------------------------------------------------------------------------
  public static String name()
  {
    String loc="Main Program/Name Service";
    loc(loc);
    outp.println("||Launching Name Service.");
    outp.print("Please Enter Name:");
	String n=inp.readString();
	outp.name(n);
	outp.println("||Exiting Name Service.");
	outp.println(" ");
    return n;
  } 
//-------------------------------------------------------------------------------------------------
  public static int exit()
  {
    
    outp.println("Exiting Now.");
	outp.println(" ");
	
	return 1;
  }
//-------------------------------------------------------------------------------------------------
  public static  String text()
  {
    outp.println("||Launching Text Service.");
	outp.println("Please insert your text here: ");
	String itext=inp.readString();
	int exit=0;
	int times;
	String swi;
	String choice;
	 while(exit==0)
	 {
		 
		 String loc="Main Program/Text Service";
         loc(loc);
         outp.println("Supported Services multiple ,customize ,text ,back.");
         swi=inp.swi();
         swi=swi.toLowerCase();
         outp.printString("");
		 switch(swi) 
		 {
			default :
			outp.def();
	        break; 
			 
			case "exit":case"e":case"end":case "back":case"b":
			exit=exit();
			break;
			 
			case "help":case "h":
			text.help();
			break;
			 
			case "multiple":case"m":
			text.multiple(itext);
			break;
			
			case "text":case"t":
			itext=text.ntext();
			break;			
		 } 
	 }
	outp.println("||Exiting Text Service.");
	outp.println(" ");
	return itext;
  }
//-------------------------------------------------------------------------------------------------
   public static void cal()
  {
	int exit=0;
	String swi;
	while(exit==0)
	 {
		 String loc="Main Program/Calculator Service";
         loc(loc);
		 outp.println("||Launching Calculator Service.");
         outp.println("Supported Services sum ,multiply ,exit or back.");;
         swi=inp.swi();
         swi=swi.toLowerCase();
         outp.printString("");
		 switch(swi)
		 {
			default :
			outp.def();
	        break; 
			 
			case "sum":case "s":
			calculator.sum();
		    break;
			
			case "multiplication":case "m":
			calculator.multi();
		    break;
			 
			case "exit":case"e":case"end":case "back":case"b":
			exit=exit();
			break;
			
			case "help":case"h":
			calculator.help();
			break; 
		 }
	 }
	 outp.println("||Exiting Calculator Service.");
	 outp.println(" "); 
  }
//-------------------------------------------------------------------------------------------------
  public static void welcomeimage()
  {
  System.out.println("---------------------------------------------------------");
  System.out.println("Build Date          Thanks For Using            11/4/2015");
  System.out.println("---------------------------------------------------------");
  System.out.println("-------------------######--##########--------------------");
  System.out.println("-----------------#---------##--------#-------------------");
  System.out.println("----------------#----------##---------#------------------");
  System.out.println("---------------#-----------##---------#------------------");
  System.out.println("---------------#-----------##--------#-------------------");
  System.out.println("---------------#-----------##########--------------------");
  System.out.println("---------------#-----------##----------------------------");
  System.out.println("---------------#-----------##----------------------------");
  System.out.println("---------------#-----------##----------------------------");
  System.out.println("----------------#----------##----------------------------");
  System.out.println("-----------------#---------##----------------------------");
  System.out.println("------------------#--------##----------------------------");
  System.out.println("-------------------######--##----------------------------");
  System.out.println("Crappy Program                           Vagelakis Orfeas");
  }
//-------------------------------------------------------------------------------------------------		 

  
  

} 