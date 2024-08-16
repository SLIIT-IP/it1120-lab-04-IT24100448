import java.util.Scanner;

public class IT24100448Lab4Q1{

	public static void main(String[] args){

	Scanner x=new Scanner(System.in);

	System.out.print("Enter a number: ");
	double num=x.nextDouble();

	if(num>0){
	System.out.println("The number is:Positive");
		 }
	else if(num<0){
	System.out.println("The number is:Negative");
	              }
	else{
	System.out.println("The number is:Zero");
	    }
	}
}