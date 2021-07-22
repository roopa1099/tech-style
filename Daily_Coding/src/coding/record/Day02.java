package coding.record;

//Question:Gven an array in cyclic sorted way, find the next largest element
//with time complexity log(n);


public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,3,12,15,17,20};
	    int element=13;
	    int p=0;
	    int l=0;
	    int last=0;
	  
	    int size=arr.length;
	    int r=size-1;
	    int mid=(l+r)/2;
	    
	    if (element>arr[size-1]){               //element>last element
	       System.out.println("No element");
	    }
	    else if(element<arr[0])                  //element<first element
	        System.out.println(arr[0]);
	        
	    else{                               
	        while(l<=r){                            //binary search
	            if(element>arr[mid]){
	                l=mid+1;
	            }
	            else if(element<arr[mid]){
	                r=mid-1;
	            }
	            else{
	                p=1;
	                break;
	            }
	            last=mid;
	            mid=(l+r)/2;
	        }
	        if(p==1){                               //same element also exists
	            System.out.println(element);
	        }
	        else{
	            if(arr[last]>element)
	                 System.out.println(arr[last]);         //mid element was greater than element
	            else
	               System.out.println(arr[last+1]);         //mid selement was smaller than element
	        }
	    }

	}

}
