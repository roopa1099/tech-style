package coding.record;
import java.util.*;


//Print string after removing spaces, TC=O(n), SC=O(1), One loop
public class Day07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ptr="I hate you";
		int i,j;
		String newstr="";
		for(i=0;i<ptr.length();i++) {
			if(ptr.charAt(i)!=' ') {
				newstr=newstr+ptr.charAt(i);
			}
		}
	
		System.out.print(newstr);
	}

}
