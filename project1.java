
import java.util.*;

public class project1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int r=0;r<3;r++) {
			if(r==0) {
				System.out.println("ROUND 1");
				System.out.println("============================");
				
			}	if(r==1) {
				System.out.println("ROUND 2");
				System.out.println("============================");
				
			}	if(r==2) {
				System.out.println("ROUND 3");
				System.out.println("============================");
				
			}
			for(int i=0;i<6;i++) {
			int random=(int)(Math.random()*100);
			int a=sc.nextInt();
			if(random==a) {
				System.out.println(random+" - "+a);
				System.out.println("BRAVO YOUR GUESS IS CORRECT");
				System.out.println("============================");
				count++;
			}
			else if(random-a>20) {
				System.out.println(random+" - "+a);
				System.out.println("YOUR GUESS IS TOO LOW");
				System.out.println("============================");
				count++;

			}
			else if(random-a<-20) {
				System.out.println(random+" - "+a);
				System.out.println("YOUR GUESS IS TOO HIGH");
				System.out.println("============================");
				count++;

			}
			else if(random-a<20||random-a>-20) {
				System.out.println(random+" - "+a);
				System.out.println("YOUR GUESS MISSED AT LITTLE");
				System.out.println("============================");
				count++;

			
		}
		
	}
			

}System.out.println("NO. OF ATTEMPTS TAKEN"+" - "+count);
		}}
