/*
Interpolation Search with Generic type
*/

class GenericArraySearching<T extends Number & Comparable<T>>
{

		//Declaring an array, which should store any type T of data
		T a[ ];    // Define that the array a[ ] can store any type of data

		GenericArraySearching(T x[]) 
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

		 T sub(T x, T y)
		{

			if (x == null || y == null) 
			{
			return null;
			}

			if (x instanceof Double) 
			{
				return (T) new Double(x.doubleValue() - y.doubleValue());
			} else if (x instanceof Integer) 
			{
				return (T)new Integer(x.intValue() - y.intValue());
			} else if (x instanceof Short) 
			{
				return (T)new Integer(x.shortValue() - y.shortValue());
			} else if (x instanceof Byte) 
			{
				return (T)new Integer(x.byteValue() - y.byteValue());
			} else if (x instanceof Float) 
			{
				return (T)new Float(x.floatValue() - y.floatValue());
			} else if (x instanceof Long) 
			{
				return (T)new Long(x.longValue() - y.longValue());
			} else 
			{
				throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
			}
		}
		
		int interpolationSearch(T k)
		{
			int l=0,u=a.length-1;
			
			while(l<=u && k.compareTo(a[l])>=0 && k.compareTo(a[u])<=0)
			{
				if (l == u) { 
				if (a[l].compareTo(k)==0) return l; 
				return -1; 
			} 
			//int loc=((k-a[l])/(a[u]-a[l]))*(u-l)+l;
			int n=sub(k,a[l]).intValue();
			int d=sub(a[u],a[l]).intValue();
			int loc=(n/d)*(u-l)+l;
			
			int result=k.compareTo(a[loc]);
			if(result==-1) u=--loc;
			else if (result==0) return loc;
			else l=++loc;
		}	
		return -1;
 }
}

public class TestInterpolationSearch {
	
	public static void main(String[] args){
			Integer i[ ] = {10, 20, 30, 40, 50}; 
			// Store the data into generic array
			GenericArraySearching<Integer> arrayInt = new GenericArraySearching<Integer>(i);
			// Printing the data….
			arrayInt.printData(); 
			int searchInt=20;
			int pos=arrayInt.interpolationSearch(searchInt);
			if(pos==-1) System.out.println(searchInt+" not found in the array");
			else System.out.println(searchInt+" found at position "+pos);
			System.out.println();
			
			Double d[ ] = {10.5, 20.5, 30.5, 40.5, 50.5}; 
			// Store the data into generic array
			GenericArraySearching<Double> arrayDouble = new GenericArraySearching<Double>(d);
			// Printing the data….
			arrayDouble.printData(); 
			Double searchDouble=30.5;
			pos=arrayDouble.interpolationSearch(searchDouble);
			if(pos==-1) System.out.println(searchDouble+" not found in the array");
			else System.out.println(searchDouble+" found at position "+pos);
			System.out.println();
			
			Short s[ ] = {10, 20, 30, 40, 50}; 
			// Store the data into generic array
			GenericArraySearching<Short> arrayShort = new GenericArraySearching<Short>(s);
			// Printing the data….
			arrayShort.printData();
			Short searchShort=40;
			pos=arrayShort.interpolationSearch(searchShort);
			if(pos==-1) System.out.println(searchShort+" not found in the array");
			else System.out.println(searchShort+" found at position "+pos);
			System.out.println();
			
			Byte b[ ] = {10, 20, 30, 40, 50}; 
			// Store the data into generic array
			GenericArraySearching<Byte> arrayByte = new GenericArraySearching<Byte>(b);
			// Printing the data….
			arrayByte.printData();
			Byte searchByte=50;
			pos=arrayByte.interpolationSearch(searchByte);
			if(pos==-1) System.out.println(searchByte+" not found in the array");
			else System.out.println(searchByte+" found at position "+pos);
			System.out.println();
			
	}
}
/*OUTPUT
10  20  30  40  50
20 found at position 1

10.5  20.5  30.5  40.5  50.5
30.5 found at position 2

10  20  30  40  50
40 found at position 3

10  20  30  40  50
50 found at position 4
*/