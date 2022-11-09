package javacode;
import java.util.Scanner;
public class Micca {

  public static void main (String[]args){

	Scanner console = new Scanner (System.in);

   int grades = 0, total = 0, choice = 0, i = 0;

do{
	System.out.println ("Do you want to enter a grade?");
	System.out.println ("Click YES");
	System.out.println ("Click NO");
   	grades = console.nextInt();

if ( grades == 1){
	System.out.println ("You chose YES");
	System.out.println ("Please enter a grade:");
	choice = console.nextInt();
	total += choice;
	i++;
}else{
	System.out.println ("You chose NO"); }
}while (grades == 1);

	total = total / i;

	System.out.print ("Total average is: " +total);

	}