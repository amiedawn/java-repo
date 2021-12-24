package javaRepo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String name = "Dave"; // string literal
		String newName = "Dave"; // this points to name
		String name1 = new String ("Dave"); // string object
		name.concat("Miller"); // doesn't work
		String newName2 = name.concat(" Miller");
		System.out.println(newName2); // Dave Miller
				
		System.out.println(name==name1); // false - compares datatypes
		System.out.println(name.equals(name1)); // true -compares values
		System.out.println(name==newName); // true -point to the same literal
	}
}
		// TODO Auto-generated method stub
//
//		int[] myArray = new int[10];
//
//		int[][] twoDArray = new int[3][4]; // has 3 rows and 4 col
//*****works
		// 2[0,0] 3[0,1] 4[0,2] 6[0,3]
		// 1[1,0] 8[1,1] 7[1,2] 9[1,3]
		// 5 3 2 6

		// System.out.println("Length of array: " + twoDArray[0].length);

//		for (int i = 0; i < twoDArray.length; i++) {
//			for (int j = 0; j < twoDArray[0].length; j++) {
//				twoDArray[i][j] = i + j;
//
//			}
//		}
//		System.out.println("Displaying 2 dimensional array");
//		for (int i = 0; i < twoDArray.length; i++) {
//			for (int j = 0; j < twoDArray[0].length; j++) {
//				System.out.print(twoDArray[i][j] + " "); // if you println here, it won't format right
//			}
//			System.out.println();
//		}
//
//	}
//
//}
//****
		
		// 1[0,0]
		// 1[1,0] 2[1,1] 
		// 1[2,0] 2[2,1]  3[2,2]
//		
//		*****this works
//		
//		int rows = 3;
//		for (int i=1; i<=rows; ++i) {
//			for (int j=1; j<=i; ++j) {
//				System.out.print(" " + j);
//				
//			}
//			System.out.println();
//		}
//	}
//}
//		*****this works end

//		for (int i = 0; i < myArray.length; i++) {
//			myArray[i] = i * 2;
//		}
////		for(int j=0; j<myArray.length; j++) {
////			System.out.println(myArray[j]);
////		
////		}
//
//		// this is same as previous loop that is commented out; this is preferred
//		for (int number : myArray) {
//			System.out.println(number);
//		}
//	}
//
//}
