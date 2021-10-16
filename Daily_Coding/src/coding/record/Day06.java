package coding.record;

//Question: Find Pair of numbrs which has sum that is multiple of 3. 

public class Day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1,j;
		int [] arr= {21, 56, 23, 54, 89};
		int r0=0,r1=0,r2=0;
		for(i1=0;i1<arr.length;i1++) {
			if(arr[i1]%3==0)
					r0++;
			else if (arr[i1]%3==1)
				r1++;
			else if (arr[i1]%3==2)
				r2++;
		}
		int pairs;
		pairs=(((r0-1)*r0)/2)+(r1*r2);
		System.out.println(pairs);

	}

}
