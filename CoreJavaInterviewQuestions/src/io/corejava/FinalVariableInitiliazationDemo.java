package io.corejava;

/**
 * 
 * 1) You can initialize final variable when it is declared.
 *  public final String NAME = "Ram K K";
 *  
 * 2) A final variable is called blank final variable , if it not initialed while declaration.
 * 
 * 3) A blank final variable can be initialed inside instance-initializer block or inside constructor. 
 * 	  If you have more than one constructor in your class, then you must have to initialize the blank final variable in 
 * all those constructors.
 * public final NAME;
 * 
 * {
 * 		NAME = "Ram K K";
 * }
 * 
 * 			(or) 
 * 
 * public A(String name){
 * 		NAME = name;
 * }
 * 
 * 3) A final static variable can be initialized inside static-initializer block.
 * 
 * public final static NAME;
 * static{
 * 		NAME = "Ram K K";
 * } 
 * 
 * */

public class FinalVariableInitiliazationDemo {

	
	// a final variable 
    // direct initialize 
    final int THRESHOLD = 5; 
    
    // a blank final variable; This must be initialized 'in all Constructors' or 'inside any one of the initializer blocks'.
    final int CAPACITY; 
	
 // another blank final variable 
    final int  MINIMUM;
    
 // a final static variable PI 
    // direct initialize 
    static final double PI = 3.141592653589793; 
    
    // a  blank final static  variable 
    static final double EULERCONSTANT; 
    
 // instance initializer block for  
    // initializing CAPACITY 
    { 
        CAPACITY = 25; 
    } 
    
    // static initializer block for  
    // initializing EULERCONSTANT 
    static{ 
        EULERCONSTANT = 2.3; 
    } 
    
    // constructor for initializing MINIMUM 
    // Note that if there are more than one 
    // constructor, you must initialize MINIMUM 
    // in them also 
    public FinalVariableInitiliazationDemo()  
    { 
        MINIMUM = -1; 
    } 
    
	public static void main(String[] args) {

		System.out.println(new FinalVariableInitiliazationDemo().MINIMUM);
		
		System.out.println(EULERCONSTANT);
		
		System.out.println(PI);
		
		System.out.println(new FinalVariableInitiliazationDemo().CAPACITY);
		
	}

}
