/*
Radix Sort On Generic Array
*/

class GenericArraySorting<T extends Number & Comparable<T>>
{
	T a[];
	
	GenericArraySorting(T x[]) 
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
		System.out.print(this.getData(i) + "  ");      // Print the i-th element in a
		System.out.println();      // Print a new line
	}
	T division(T x, int y)
	{
		if (x == null || y == 0) 
		{
		return null;
		}

		if (x instanceof Integer) 
		{
			return (T)new Integer(x.intValue() / y);
		} else if (x instanceof Short) 
		{
			return (T)new Integer(x.shortValue() / y);
		} else if (x instanceof Byte) 
		{
			return (T)new Integer(x.byteValue() / y);
		}if (x instanceof Long) 
		{
			return (T)new Long(x.longValue() / y);
		} else 
		{
			throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
		}
	}
		
	T modulus(T x, int y)
	{
		if (x == null || y == 0) 
		{
		return null;
		}

		if (x instanceof Integer) 
		{
			return (T)new Integer(x.intValue() % y);
		} else if (x instanceof Short) 
		{
			return (T)new Integer(x.shortValue() % y);
		} else if (x instanceof Byte) 
		{
			return (T)new Integer(x.byteValue() % y);
		}if (x instanceof Long) 
		{
			return (T)new Long(x.longValue() % y);
		} else 
		{
			throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
		}
	}
	
	T getMax()
	{
		T max=a[0];
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i].compareTo(max)==1)
			   max=a[i];
		}
		return max;
	}
	
	private static <T> T[] copyArray(T[] source)
	{
		return source.clone();
	}
	void countSort(int exp)
	{
		int i,size=a.length,count[]=new int[10];
		T[] output=copyArray(a);
		
		for(i=0;i<size;i++)
		{
			count[modulus(division(a[i],exp),10).intValue()]++;
		}
		
		for(i=1;i<10;i++)
		{
			count[i]+=count[i-1];
		}
		for(i=size-1;i>=0;i--)
		{
			output[count[modulus(division(a[i],exp),10).intValue()]-1]=a[i];
			count[modulus(division(a[i],exp),10).intValue()]--;
		}
		for(i=0;i<size;i++)
		{
			a[i]=output[i];
		}
	}
	
	void radixSort()
	{
		int exp=1;
		T max=this.getMax();
		Long m=new Long(division(max,exp).longValue());
		for(;m>0;exp=exp*10)
		{
			this.countSort(exp);
			m=division(max,exp).longValue();
		}
	}

}

public class TestRadixSort
{
	
	public static void main(String[] args)
	{
		Integer i[ ] = {59, 44, 79, 74, 88}; 
		// Store the data into generic array
		GenericArraySorting<Integer> arrayIntObj = new GenericArraySorting<Integer>(i);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayIntObj.printData(); 
		arrayIntObj.radixSort();
		System.out.print("Sorted Array is : ");
		arrayIntObj.printData();
		System.out.println();
		
		Short s[ ] = {99, 18, 61, 57, 64}; 
		// Store the data into generic array
		GenericArraySorting<Short> arrayShortObj = new GenericArraySorting<Short>(s);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayShortObj.printData(); 
		arrayShortObj.radixSort();
		System.out.print("Sorted Array is : ");
		arrayShortObj.printData();
		System.out.println();
		
		Byte b[ ] = {90, 81, 73, 64, 10}; 
		// Store the data into generic array
		GenericArraySorting<Byte> arrayByteObj = new GenericArraySorting<Byte>(b);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayByteObj.printData(); 
		arrayByteObj.radixSort();
		System.out.print("Sorted Array is : ");
		arrayByteObj.printData();
	}
}
/*OUTPUT
Array Before Sorting : 59  44  79  74  88
Sorted Array is : 44  59  74  79  88

Array Before Sorting : 99  18  61  57  64
Sorted Array is : 18  57  61  64  99

Array Before Sorting : 90  81  73  64  10
Sorted Array is : 10  64  73  81  90
*/