package javaCollections;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] height = {1,2,4,3};
      
      //Here time complexity is large
//      int max = 0;
////    int temp;
//      int size = height.length;
//       for(int i=0;i<size;i++){
//           for(int j=i+1;j<size;j++){
//               int x,y;
//               if(size<=2){
//                   x=1;
//               }
//               if(i==0)
//            	   x=j;
//               else{
//               x=j-i;
//               }
////                  if(height[i]>height[j]){
////                      y=height[j];
////                    }
////               else
////                   y=height[i];
//                  y = Math.min(height[i], height[j]);
////                   temp = x*y;
////                   if(temp>max){
////                   max=temp;
////                   }
//                   max = Math.max(max, x*y);
//               }
//           }
//      System.out.println(max);
//	}
      
      //Efficient way
      int i=0,n=height.length,j=n-1,currentwater=0,maxwater=0;
      while(i<j) {
    	  currentwater = Math.min(height[i], height[j])*(j-i);
    	  maxwater = Math.max(currentwater, maxwater);
    	  if(height[i]<height[j]) {
    		  i++;
    	  }
    	  else if(height[i]>height[j]){
    		  j--;
    	  }
    	  else {
    		  i++;
    		  j--;
    	  }
      }
      System.out.println(maxwater);
	}
}
