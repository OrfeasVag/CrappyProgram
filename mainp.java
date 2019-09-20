// Orfeas Vagelakis 
public class mainp
{
 public static void main(String[] args) 
 {
  //variables
  String name,swi,text,loc;
  int end=0;
  //start
  service.welcomeimage();
  outp.printString("Launching Program.");
  name=service.name();
  outp.welcome(name);
  while(end==0)
  {
  loc="Main Program";
  service.loc(loc);
  outp.println("Supported Services  calculator ,text ,name ,who ,help ,exit or back.");
  swi=inp.swi();
  swi=swi.toLowerCase();
  outp.printString("");
   switch(swi) 
   {
	default :
	 outp.def();
	break; 
	
    case "exit":case"e":case"end":case "back":case"b":
	 end=service.exit();
	break;
	
	case "who": case "w":
	outp.printString("");
	outp.println("Your name is : "+name+" .");
	outp.printString("");
	break;
	
	case"name": case"n": 
	outp.println("Changing user's name.");
	name=service.name();
	break;
	
	case "help": case"h":
	service.help();
	break;
	
	case "text": case"t":
	text=service.text();
	break;
	
	case "calculator": case"c":case"cal":
    service.cal();
	break;
   }
  }
  service.welcomeimage();
 }
}
				