/**
 * 
 */
package gerard;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * @author Timothy Gerard 
 *
 */
public class MainClass {
	/**
	 * 
	 */
	 static Scanner scan = new Scanner(System.in);
	/**
	 * 
	 * @param month
	 * @param dob
	 * method that calculates the date of birth 
	 */
	 public static void setMonth(int month, Calendar dob){
		 	if(month == 1)
		 		dob.set(Calendar.MONTH, Calendar.JANUARY);
		 	else if(month == 2)
		 		dob.set(Calendar.MONTH, Calendar.FEBRUARY);
		 	else if(month == 3)
		 		dob.set(Calendar.MONTH, Calendar.MARCH);
		 	else if(month == 4)
		 		dob.set(Calendar.MONTH, Calendar.APRIL);
		 	else if(month == 5)
		 		dob.set(Calendar.MONTH, Calendar.MAY);
		 	else if(month == 6)
		 		dob.set(Calendar.MONTH, Calendar.JUNE);
		 	else if(month == 7)
		 		dob.set(Calendar.MONTH, Calendar.JULY);
		 	else if(month == 8)
		 		dob.set(Calendar.MONTH, Calendar.AUGUST);
		 	else if(month == 9)
		 		dob.set(Calendar.MONTH, Calendar.SEPTEMBER);
		 	else if(month == 10)
		 		dob.set(Calendar.MONTH, Calendar.OCTOBER);
		 	else if(month == 11)
		 		dob.set(Calendar.MONTH, Calendar.NOVEMBER);
		 	else if(month == 12)
		 		dob.set(Calendar.MONTH, Calendar.DECEMBER);
		}
	 /**
	  * 
	  * @param prov
	  * @return
	  * method for the name of the province
	  */
	public static Province FindProv(String prov){
		if (prov.equalsIgnoreCase("Alberta")||prov.equalsIgnoreCase("AB"))
			return Province.AB;		
		else if (prov.equalsIgnoreCase("BrithishColumbia")||prov.equalsIgnoreCase("BC")|| prov.equalsIgnoreCase("Brithish Columbia"))
			return Province.BC;		
		else if (prov.equalsIgnoreCase("Manitoba")||prov.equalsIgnoreCase("MB"))
			return Province.MB;			
		else if (prov.equalsIgnoreCase("NewBrunswick")||prov.equalsIgnoreCase("NB")||prov.equalsIgnoreCase("New Brunswick"))
			return Province.NB;			
		else if (prov.equalsIgnoreCase("NewFoundLand")||prov.equalsIgnoreCase("NL"))
			return Province.NL;			
		else if (prov.equalsIgnoreCase("NovaScotia")||prov.equalsIgnoreCase("NS"))
			return Province.NS;			
		else if (prov.equalsIgnoreCase("NorthWestTerritory")||prov.equalsIgnoreCase("NT"))
			return Province.NT;			
		else if (prov.equalsIgnoreCase("Nunavut")||prov.equalsIgnoreCase("NU"))
			return Province.NU;			
		else if (prov.equalsIgnoreCase("Ontario")||prov.equalsIgnoreCase("Ont.")||prov.equalsIgnoreCase("ON"))
			return  Province.ON;		
		else if (prov.equalsIgnoreCase("PrinceEdwardIsland")||prov.equalsIgnoreCase("Prince Edward Island")||prov.equalsIgnoreCase("PEI"))
			return  Province.PEI;		
		else if (prov.equalsIgnoreCase("Quebec")||prov.equalsIgnoreCase("QC"))
			return Province.QC;		
		else if (prov.equalsIgnoreCase("Yukon")||prov.equalsIgnoreCase("Yukon Territory")||prov.equalsIgnoreCase("YT"))
			return  Province.YT;		
		else if (prov.equalsIgnoreCase("Saskatchiwan")||prov.equalsIgnoreCase("SK"))
			return  Province.SK;
		
		return null;	
	}
	/**
	 * 
	 * @param aL
	 * method that adds a new contestant
	 */
	 public static void addContestant(ArrayList <ContestantInformation> aL) {
		   
		 //initalizing the objects	
			Calendar bday = new GregorianCalendar();	
			
			//initalizing other variables just in case they are needed
			String fname, lname, stName, city, postalCode;
			int stNum, phoneNum;
			
			String prov;
			Province province = null;
			String userInput;
			boolean flag = false;
			boolean continuee = false;
			
			ContestantInformation contestant = new ContestantInformation();
			
			//user inputs their first Name
			do{
				flag = false;
				try{
					System.out.print("What is your first name?");
					contestant.setFname(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			//use inputs their last Name
			do{
				flag = false;
				try{
					System.out.print("What is your last name?");
					contestant.setLname(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			do{
				flag = false;
				try{
					System.out.print("What is your date of birth? (yyyy/mm/dd)");
					String everything = scan.nextLine();
					bday.set(Calendar.YEAR, Integer.parseInt(everything.substring(0,4)));
					setMonth(Integer.parseInt(everything.substring(5,7)),bday);
					bday.set(Calendar.DAY_OF_MONTH, Integer.parseInt(everything.substring(8,10)));
					contestant.setBday(bday);
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			
			//user inputs their stNumber
			do{
				flag = false;
				try{
					System.out.print("What is your street number?");
					contestant.setStNum(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			// user inputs their stName
			do{
				flag = false;
				try{
					System.out.print("What street do you live on?");
					contestant.setStName(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			//user inputs the city they live in
			do{
				flag = false;
				try{
					System.out.print("What city do you live in?");
					contestant.setCity(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}
			while(flag);
			
			//user inputs the province they live in
			do{
				flag = false;
				try{
					System.out.print("What Province do you live in?");
					prov = scan.nextLine();
					contestant.setProvince(FindProv(prov));
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			//user inputs their postal code
			do{
				flag = false;
				try{
					System.out.print("What is your Postal Code?");
					contestant.setPostalCode(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			//the user inputs their phone number
			do{
				flag = false;
				try{
					System.out.print("What is your phone number?");
					contestant.setPhoneNum(scan.nextLine());
				}catch(InvalidInputException e)
				{
					System.out.print(e.getMessage());
					flag = true;
				}
			}while(flag);
			
			//adds the contestant information the the array list aL
					aL.add(contestant);
	 }
	 /**
	  * 
	  * @param aL
	  * allows the user to print one of the contestants information using the print class
	  */
	 public static void printLabel(ArrayList <ContestantInformation> aL, int index){
		 ContestantInformation contestant;		
		 if(index >= 0 && index < aL.size()){
			 //formats the contestants information using the code in the Label class
			 Label Label = new Label(aL.get(index));
			 System.out.println(Label.toString());
		 }
		 else
			 System.out.println("You're Stupid");
	 }
	 
	 /**
	  * 
	  * @param aL
	  * allows the user to print all the contestants information using the print class
	  */
	 public static void printAllLabel(ArrayList <ContestantInformation> aL){
		 for(int i = 0; i < aL.size(); i++){
			 printLabel(aL, i);
		 }
	 }
	 /**
	  * 
	  * @param aL
	  * allows the user to search for a contestant
	  */
	 
	 public static void search(ArrayList <ContestantInformation> aL){
		 ContestantInformation contestant = new ContestantInformation();
		 SearchingArrays Search = new SearchingArrays();
			System.out.println("Enter Last Name: ");
			String lastname = scan.nextLine();
			System.out.println("Enter First Name: ");
			String firstname = scan.nextLine();
			System.out.println("Choose one of the following options.");
			System.out.println("1. Linear Search.");
			System.out.println("2. Binary Search.");
			
			String input = scan.nextLine();
			if (input.equals("1"))
				printLabel(aL, Search.linearSearch(aL, firstname, lastname));
			if(input.equals("2"))
				Search.binarySearch(aL, lastname, firstname);
		 
		 
	 }
	 
	 public static void deleteContestant(ArrayList <ContestantInformation> aL){
		 ContestantInformation contestant = new ContestantInformation();
		 //contestant.remove();
	 }
	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ContestantInformation> aL = new ArrayList<ContestantInformation>();
		ContestantInformation contestant = new ContestantInformation();
		String inpjut;
		boolean done = false;
		
		while(!done){
		System.out.println("Choose one of the following options.");
		System.out.println("1. Add another contestant.");
		System.out.println("2. Print the contestant information.");
		System.out.println("3. Search for a contestant.");
		System.out.println("4. Delete contestant");
		System.out.println("5. Delete all the contestants");
		System.out.println("6. Exit Program.");
		
		inpjut = scan.nextLine();
		
		if (inpjut.equals("1"))
			addContestant(aL);
		else if (inpjut.equals("2"))
			 printAllLabel(aL);
		else if(inpjut.equals("3"))
			search(aL);
		else if(inpjut.equals("4"))
			deleteContestant(aL);
		//else if (inpjut.equals("5"))
		//aL.removeALL(contestant);
		else if(inpjut.equals("6"))
			done = true;
		}
	}

}

