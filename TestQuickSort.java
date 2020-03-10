 /*QUICK SORT on Generic Array
*/ 
 class GenericArraySorting<T extends Comparable<T>>
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
	   int partition(T arr[], int low, int high) 
    { 
        T pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        T temp;
		for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j].compareTo(pivot)<0) 
            { 
                i++; 
				// swap arr[i] and arr[j] 
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }
	void quickSort(int low,int high)
	{
		if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(a, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quickSort(low, pi-1); 
            quickSort(pi+1, high); 
        } 
	}
 }
 
 public class TestQuickSort
 {
	public static void main(String[] args)
	{
		Integer i[ ] = {59, 44, 79, 74, 88}; 
		// Store the data into generic array
		GenericArraySorting<Integer> arrayIntObj = new GenericArraySorting<Integer>(i);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayIntObj.printData(); 
		arrayIntObj.quickSort(0,i.length-1);
		System.out.print("Sorted Array is : ");
		arrayIntObj.printData();
		System.out.println();
		
		Short s[ ] = {99, 18, 61, 57, 64}; 
		// Store the data into generic array
		GenericArraySorting<Short> arrayShortObj = new GenericArraySorting<Short>(s);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayShortObj.printData(); 
		arrayShortObj.quickSort(0,i.length-1);
		System.out.print("Sorted Array is : ");
		arrayShortObj.printData();
		System.out.println();
		
		Byte b[ ] = {90, 81, 73, 64, 10}; 
		// Store the data into generic array
		GenericArraySorting<Byte> arrayByteObj = new GenericArraySorting<Byte>(b);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayByteObj.printData(); 
		arrayByteObj.quickSort(0,i.length-1);
		System.out.print("Sorted Array is : ");
		arrayByteObj.printData();
		System.out.println();
		
		Double d[ ] = {19.5, 10.5, 90.5, 110.9, 105.5}; 
		// Store the data into generic array
		GenericArraySorting<Double> arrayDoubleObj = new GenericArraySorting<Double>(d);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayDoubleObj.printData(); 
		arrayDoubleObj.quickSort(0,i.length-1);
		System.out.print("Sorted Array is : ");
		arrayDoubleObj.printData();
		System.out.println();
		
		String st[ ] = {"deepak","debasis","data","subhra","zeeshan"}; 
		// Store the data into generic array
		GenericArraySorting<String> arrayStringObj = new GenericArraySorting<String>(st);
		// Printing the data….
		System.out.print("Array Before Sorting : ");
		arrayStringObj.printData(); 
		arrayStringObj.quickSort(0,i.length-1);
		System.out.print("Sorted Array is : ");
		arrayStringObj.printData();		
	}  
 }
 /*OUTPUT
 Array Before Sorting : 59  44  79  74  88
Sorted Array is : 44  59  74  79  88

Array Before Sorting : 99  18  61  57  64
Sorted Array is : 18  57  61  64  99

Array Before Sorting : 90  81  73  64  10
Sorted Array is : 10  64  73  81  90

Array Before Sorting : 19.5  10.5  90.5  110.9  105.5
Sorted Array is : 10.5  19.5  90.5  105.5  110.9

Array Before Sorting : deepak  debasis  data  subhra  zeeshan
Sorted Array is : data  debasis  deepak  subhra  zeeshan
 
 */