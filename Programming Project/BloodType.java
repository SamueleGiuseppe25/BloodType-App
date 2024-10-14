/**
 * This is a program for Blood Type Compatibility.
 * Student Name: Giuseppe Samuele Quarato
 * Student ID: 74394
 * Email Address: 74394@student.dorset-college.ie
 */

 // first of all we import the scanner.
import java.util.Scanner; 
public class BloodType {

	public static void main(String[] args) {
	
try (Scanner kb = new Scanner(System.in)) {
// Assigning a string for each blood type.
String BT1 = "A+";
String BT2 = "O+";
String BT3 = "B+";
String BT4 = "AB+";
String BT5 = "A-";
String BT6 = "O-";
String BT7 = "B-";
String BT8 = "AB-";
// Create a string to input UserBlood choice. 
String UB;
// Ask user to provide blood type that match the predefined blood types.
System.out.println("Please provide blood type in uppercase(A+,O+,B+,AB+,A-,O-,B-,AB-):");
UB= kb.next();
// Create a while loop to assure the user choose the predifined blood types. 
while (!(UB.equals(BT1)||UB.equals(BT2)||UB.equals(BT3)||UB.equals(BT4)
		||UB.equals(BT5)||UB.equals(BT6)||UB.equals(BT7)||UB.equals(BT8))){
System.out.println("Choice doesn't exist, please provide blood type in uppercase(A+,O+,B+,AB+,A-,O-,B-,AB-) ");
UB= kb.next();}

// ask the user about giving or receiving blood.
System.out.println("Do you want to know about giving or receiving"
		+ "(1 for gives,2 for receives):");
//Create an integer to identify the option of 1 or 2.
int A = kb.nextInt();
// User assign value to the integer A. 

// Assure with while loop that user input 1 or 2. If answer different than 1 or 2 repeat loop.
while (A !=1 && A != 2 ) {
	System.out.println("Please input 1 for gives or 2 for receiving");
	A= kb.nextInt();
	}
	
// Open a if statement. If the integer A is equal to 1...			
if (A==1) {
// If the string UB is equal to the string BT1 print out the following value. So on for the rest of the string till BT7.
	if (UB.equals(BT1)) {
	System.out.println("You can give to A+,AB+");
	}else if (UB.equals(BT2)) {
	System.out.println("you can give to O+,A+,B+,AB+");
	}else if (UB.equals(BT3)) {
	System.out.println("you can give to B+,AB+");
	}else if (UB.equals(BT4)) {
	System.out.println("you can give to AB+");
	}else if (UB.equals(BT5)) {
	System.out.println("you can give to A+,A-,AB+,AB-");
	}else if (UB.equals(BT6)) {
	System.out.println("you can give to EVERYONE");
	}else if (UB.equals(BT7)) {
	System.out.println("you can give to B+,B,AB+,AB-");
	}else {
	System.out.println("you can give to AB+,AB-");}
}

// Do the same of the previous if statement but now if the integer a is equal to 2. 
if (A==2) {
	if (UB.equals(BT1)) {
	System.out.println("You can receive from A+,AB-,O+,O-");
	}else if (UB.equals(BT2)) {
	System.out.println("you can receive from O+,O-");
	}else if (UB.equals(BT3)) {
	System.out.println("you can receive from  B+,B-,O+,O-,");
	}else if (UB.equals(BT4)) {
	System.out.println("you can  receive from EVERYONE ");
	}else if (UB.equals(BT5)) {
	System.out.println("you can receive from  A-,O-");
	}else if (UB.equals(BT6)) {
	System.out.println("you can receive from O-");
	}else if (UB.equals(BT7)) {
	System.out.println("you can  receive from B-,O-");
	}else {
	System.out.println("you can receive from AB-,A-,B-,O-");}


}
}

}
}

	