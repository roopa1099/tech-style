package coding.record;
//
//Question:Find largest element in an array that contains elements first in 
//increasing order then in decreasing order


public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,4,5,16,17,18,19,21,26,29,20,11,6,4};
		int size=arr.length;
		int l=0,r=size-1,mid=(l+r)/2,position=0;
		while(l<=r){
		    if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
		        position=mid;
		        break;
		    }
		    else if(arr[mid]<arr[mid+1])
		        l=mid+1;
		    
		    else if(arr[mid]<arr[mid-1])
		        r=mid-1;
		    mid=(l+r)/2;
		}
		
		if(arr[position]>=arr[size-1])
		   System.out.println(arr[position]);
		else
		    System.out.println(arr[size-1]);
	}
	}


