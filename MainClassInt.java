/*
Example 3.1 : Program to handle an array of integers
*/

class SpecificArrayInt {
     // Declaring an array of integer numbers
     int a; 
 
     // Constructor to load the array
     SpecificArrayInt(int a[]) { 
         this.a = a;
     }  
 
     // Method to print the array elements
     void printInt() {
         for(int x : a) 
             System.out.println(x);
     } 

   // Method to reverse the array elements
   void reverseInt() {
        j = a.length;
        for (int i=0; i<j; i++){
           int temp;
           temp = a[i]; 
           a[i] = a[j]; 
           a[j] = temp; 
           j--;
       } // End of for-loop
    } // end of method
} // end of class
 
class MainClassInt {
      //This class use the class SpecificArrayInt to manipulate data in it

      SpecificArrayInt a = {1, 2, 3, 4, 5};

      a.printInt();

      a.reverseInt();

      a.printInt();
}
/*OUTPUT

*/