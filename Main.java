/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {    //PRPR
	    int pc=0,i;
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		 char[] ch = str.toCharArray();
		for(i=0; i<ch.length-1; i++){
		    if(ch[i]=='R' || ch[i]=='P'){

		    if(ch[i]==ch[i+1]){
		        pc=1;
		        System.out.print("Imperfect");
		        break;
		        }
		    }
		}
		    
		    if((pc==0) )
		    System.out.print("Perfect");
		    
		
	}

}
