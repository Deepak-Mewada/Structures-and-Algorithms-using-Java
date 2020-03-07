/*
Example 3.2 : Program to handle an array of doubles
*/
class SpecificArrayDouble {
     // Declaring an array of double values
     double b; 
 
     // Constructor to load the array
     SpecificArrayDouble(double b[]) { 
         this.b = b;
     }  
 
     // Method to print the array elements
     void printDouble() {
         for(double x : b) 
             System.out.println(x);
     } 
   // Method to reverse the array elements
   void reverseDouble() {
        j = b.length;
        for (int i=0; i<j; i++){
           double temp;
           temp = a[i]; 
           a[i] = a[j]; 
           a[j] = temp; 
           j--;
       } // End of for-loop
    } // end of method
} // end of class
 
class MainClassDouble {
      //This class use the class SpecificArrayInt to manipulate data in it

      SpecificArrayDouble b = {1.2, 2.3, 3.4, 4.5, 5.6};

      b.printDouble();

      b.reverseDouble();

      b.printDouble();
}
/*
OUTPUT
*/