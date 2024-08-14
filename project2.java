package codsoft;
import java.util.*;

public class project2 {

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER OF SUBJECTS:");
	int j=sc.nextInt();
	int sum=0;
	
	System.out.println("ENTER THE MARKS OBTAINED:");
	for(int i=0;i<j;i++) {
		int a=sc.nextInt();
	sum+=a;
		
	}float avg=(float)sum/j;
	System.out.println("YOUR TOTAL MARKS ARE:"+sum);
	System.out.println("YOUR AVERAGE PERCENTAGE IS:"+avg+"%");
	if(avg<40) {
	
		System.out.println("YOUR ACHIEVE GRADE:F");
	
	
	
}if(avg>=40&&avg<=50) {
	
	System.out.println("YOUR ACHIEVE GRADE:C");
	
	
	
}if(avg>50&&avg<=60) {
	
	System.out.println("YOUR ACHIEVE GRADE:C+");
}if(avg>60&&avg<=70) {
	
	System.out.println("YOUR ACHIEVE GRADE:B");}
if(avg>70&&avg<=80) {
	
	System.out.println("YOUR ACHIEVE GRADE:B+");}
if(avg>80&&avg<=90) {
	
	System.out.println("YOUR ACHIEVE GRADE:A");}
if(avg>90&&avg<=100) {
	
	System.out.println("YOUR ACHIEVE GRADE:A+");}
	
}}
	

	
	
	

	
	
	

	
	


