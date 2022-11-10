package javaCollections;

public class medianOfTwoSortedArrya {

	public static double median(int[] nums1,int[] nums2) {
		int size1=nums1.length,size2=nums2.length,finalSize=size1+size2;
		int finalArray[] = new int[finalSize];
		int temp,q=0,w=0;
		double result;
			while(q<size1) {
				finalArray[q]=nums1[q];
				q++;
			}
			while(w<size2) {
				finalArray[size1+w]=nums2[w];
				w++;
			}				
			for(int i=0;i<finalSize;i++) {
				for(int j=i+1;j<finalSize;j++) {
					if(finalArray[i]>finalArray[j]) {
						temp = finalArray[i];
						finalArray[i] = finalArray[j];
						finalArray[j] = temp;
					}
				}
			}
			if((finalSize)%2 != 0) {				
				result= finalArray[(finalSize / 2)];
			}
					
			else {
				result = (finalArray[finalSize/2-1]+finalArray[(finalSize/2)])/2.0;
			}
			
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2};
		int nums2[] = {3,4};
		System.out.println(median(nums1,nums2));
		
	}
	
	

}
