import java.util.Scanner;

class S4Assignment1
{
   public static void main(String args[])
   {
		int[] firstArray = new int[]{1,2,3,4};
		int[] reversedArray = new int[firstArray.length];
		int j = 0;
		for (int i = firstArray.length - 1; i >= 0; i--){
			reversedArray[j++] = firstArray[i];
		}
		
		System.out.print("Original array - ");
		
		for(int i = 0 ; i<firstArray.length; i++){
			System.out.print(firstArray[i]);
		}
		System.out.println("");
		
		System.out.print("Reverse array - ");
		
		for(int i = 0 ; i<reversedArray.length; i++){
			System.out.print(reversedArray[i]);
		}
		
				
   }
}