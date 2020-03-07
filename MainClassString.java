/*
Example 3.3 : Program to handle an array of Strings
*/

class SpecificArrayString {
     // Declaring an array of double values
     String c; 
 
     // Constructor to load the array
     SpecificArrayDouble(String c[]) { 
         this.c = c;
     }  
 
     // Method to print the array elements
     void printString() {
         for(String x : c) 
             System.out.println(x);
     } 
   // Method to reverse the array elements
   void reverseString() {
        j = c.length;
        for (int i=0; i<j; i++){
           double temp;
           temp = c[i]; 
           c[i] = c[j]; 
           c[j] = temp; 
           j--;
       } // End of for-loop
    } // end of method
} // end of class
 
class MainClassString {
      //This class use the class SpecificArrayInt to manipulate data in it

      SpecificArrayDouble b = {“A”, “B”, “C”, “D”, “E”};

      c.printString();

      c.reverseString();

      c.printString();
}
/*
OUTPUT
*/