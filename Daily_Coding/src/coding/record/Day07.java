package coding.record;
import java.util.*;
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
//		char [] str=sc.next().toCharArray();
//		String newstr="";
//		for(int i=0;i<str.length;i++)
//		{	System.out.println(newstr);
//
//			if(str[i]!=' ')
//				newstr=newstr+str[i];
//		}
//		System.out.println(newstr);

	}

}
