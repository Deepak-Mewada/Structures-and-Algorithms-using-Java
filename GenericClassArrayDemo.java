/*
Example 3.5: Defining  class to process arrays with any data type
*/
	class GenericArray<T> 
	{
		//Declaring an array, which should store any type T of data
		T a[ ];    // Define that the array a[ ] can store any type of data

		GenericArray(T x[]) 
		{        // Define a constructor
		  a = x;
		}

		T getData(int i) 
		{         // To return the element stored in the i-th place in the array 
		   return a[i];
		}

		void printData() 
		{                // A generic method to print the elements in array a
			for(int i = 0; i < a.length; i ++)
				System.out.print(getData(i) + "  ");      // Print the i-th element in a
			System.out.println();      // Print a new line
		}
	   
		void reverseArray () 
		{           // Generic method to reversed the order of elements in array a
			int front = 0;
			int rear = a.length-1;
			T temp;
			while(front < rear)  
			{
				temp = a[rear];
				a[rear] = a[front];
				a[front] = temp;
				front++; 
				rear--;
			}
		}
	}
public	class GenericClassArrayDemo 
	{
		public static void main(String[] args)
		{
			//Creating an array of integer data
			Integer x[ ] = {10, 20, 30, 40, 50};      // It is an array of Integer objects
			
			// Store the data into generic array
			GenericArray<Integer> arrayInt = new GenericArray<Integer>(x);
			//Alternatively:
			// GenericArray<Integer> arrayInt = new GenericArray<Integer>(new Integer x[ ] {10, 20, 30, 40, 50});
			// Printing the data….
			arrayInt.printData();          // Printing the array of integer objects
			
			//Reverse ordering of data….
			arrayInt.reverseArray();
			
			// Printing the data after reverse ordering….
			arrayInt.printData();          // Printing the array of integer objects
		
			// -------------------------------------------------------------------------------------------------------------------
			
			//Creating an array of String data
			String y[ ] = {"A", "B", "C"};    // It is an array of String data
			// Store the data into generic array
			GenericArray<String> arrayString = new GenericArray<String>(y);
			
			// Printing the data….
			arrayString.printData();          // Printing the array of integer objects
			
			//Reverse ordering of data….
			arrayString.reverseArray();
			
			// Printing the data after reverse ordering….
			arrayString.printData();          // Printing the array of integer objects
		
			// -------------------------------------------------------------------------------------------------------------------
			
			//Creating an array of float data
			Double z[ ] = {1.2, 2.3, 3.4, 4.5};      // It is an array of double data
			
			// Store the data into generic array
			GenericArray<Double> arrayDouble = new GenericArray<Double>(z);
			
		   // Printing the data….
			arrayDouble.printData();          // Printing the array of integer objects
			
			//Reverse ordering of data….
			arrayDouble.reverseArray();
			
			// Printing the data after reverse ordering….
			arrayDouble.printData();          // Printing the array of integer objects
		}
	}
/*
OUTPUT
10  20  30  40  50
50  40  30  20  10
A  B  C
C  B  A
1.2  2.3  3.4  4.5
4.5  3.4  2.3  1.2

*/