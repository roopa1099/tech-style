package coding.record;

import java.util.HashMap;

//
//Question: Given an character array of size 2n, find whether the frequency of all 
//characters in first n postion is equal to the frequncy in th next n character



public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch= {'c','a','d','c','a','a','d','d','c','a'};
		int i,j,size=ch.length;
		HashMap<Character,Integer> hash=new HashMap<>();
		for(i=0;i<size/2;i++) {
			if(hash.containsKey(ch[i]))
				hash.put(ch[i],hash.get(ch[i])+1);
			else
				hash.put(ch[i],1);
		}
		
		for(i=(size/2);i<size;i++) {
			if(hash.containsKey(ch[i]))
				hash.put(ch[i],hash.get(ch[i])-1);
			else
				hash.put(ch[i],-1);
		}
		
		int p=0;
		for(char chr:hash.keySet()) {
			if(hash.get(chr)>0 || hash.get(chr)<0) {
				p=1;
				break;
			}
		}
		if(p==0)
			System.out.print("The freqency of the result was found same");
		else
			System.out.print("Not Same freqency");
		
	}

}
