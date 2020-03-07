/*
Example 3.4 : Defining a generic class
*/

class GenericClass<Type>  {      // Use < > to specify class type
    Type obj;                    // An object of type T is declared 
    GenericClass(Type obj) {     // Constructor of the generic class
        this.obj = obj;  
    }  
    public Type getObject()  {   // A Method in the class 
        return this.obj; 
    } 
} 

class GenericClassTest  {     // Driver class to test the above 
    public static void main (String[] args) { 
        GenericClass <Integer> iObj = new GenericClass <Integer>(15); 
                              // A class with Integer type
        System.out.println(iObj.getObject()); 
   
        GenericClass <String> sObj = new GenericClass <String>("Java");
                             // Another class with String type
        System.out.println(sObj.getObject()); 
    } 
}

/*
OUTPUT:
15
Java
*/