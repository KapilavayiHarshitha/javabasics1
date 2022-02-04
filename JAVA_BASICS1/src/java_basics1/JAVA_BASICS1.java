/**Document comment representation
 * 1.How to create class,object,method and its signature.
 * 2.write a program to print your name
 * 3. Write a program for a Single line comment, multi-line and documentation comments
 *4. Define variables for different Data Types int, Boolean, char, float, double and print on the 
     Console
 *5. Define the local and Global variables with the same name and print both variables and 
     understand the scope of the variables
 *6. Write a function to print your name and call the function from main method
 */
package java_basics1; //package with package name(singleline comments representation)
public class JAVA_BASICS1//class with classname
{
    int x=5;// int datatype and x is global variable
    String name="Kapilavayi.Harshitha"; /*
                                        multi line comment representation
                                        Printing my name by using keyword
                                        */ 
    boolean bool_value=true;//Boolean datatype
    char my_initial='K'; //char datatype
    float my_percentage=85.79f;//float datatype
    static void myStaticmethod()//static method
    {
        System.out.println("It is static method so no need to create object to access");
    } 
    public void myMethod()//normal method
    { 
        int x=10;// x is local variable 
        String my_name="Harshitha";
        System.out.println("It is normal method we need create object to access");
        System.out.println("Local variable:"+x);
        System.out.println("Access my name from main method:"+my_name);
        
    }  
    public static void main(String[] args) {
        myStaticmethod();
        JAVA_BASICS1 obj=new JAVA_BASICS1();
        obj.myMethod(); 
        System.out.println("Global variable:"+obj.x);
        System.out.println(" my name :"+obj.name);
        System.out.println("Boolean data type:"+obj.bool_value);
        System.out.println("Char datatype:"+obj.my_initial);
        System.out.println("Float datatype:"+obj.my_percentage);
       
        
        
    }
    
}
