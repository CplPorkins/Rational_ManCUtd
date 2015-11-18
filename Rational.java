/*
EEA - Elias "RzrWire" Milborn, Lorenz "Big L" Vargas
APCS1 pd10
HW32 -- Irrationality stops here
2015-11-18
*/

public class Rational{
  /*=====Instance=Variables=====*/
  private int numerator;
  private int denominator;

  /*=====Accessors=====*/
    public int getNumerator() {
	return numerator;
    }

    public int getDenominator() {
	return denominator;
    }
    
  /*=====Constructors=====*/
  public Rational() {
    //Creates a new Rational with the value of 0/1
	this(0,1);
    }//end basic constructor

    public Rational(double num, double denom) {
    //takes 2 parameters, one for the numerator, one for the denominator
    //if an invalid denominator is attempted, should print a message and set the number to 0/1
	denominator = denom;
	numerator = num;
	if (denom == 0) {
	    System.out.println("Error. Invalid denominator. Setting numerator to 0 and denominator to 1.");
	    numerator = 0;
	    denominator = 1;
	}
    }//end constructor
  
  /*=====Methods=====*/
  public String toString(){
    //returns a string representation of the rational number (formatting of your choice)
    //example for us "3/2" -EM
      String ret = numerator + "/" + denominator;
      return ret;
  }
  
  public double floatValue(){
    //Returns a floating point value of the number
    //Uses the most precise floating point primitive (which is double btw i think-EM)
      double ret = numerator/denominator;
      return ret;
  }
  
  public void multiply(Rational multiplier){
    //Takes 1 Rational object as a parameter and multiplies it by this Rational object
    //Does not return any value
    //Should modify this object and leave the parameter alone (see below for example)
    //Need not reduce the fraction
      int num = numerator * multiplier.getNumerator();
      int denom = denominator * multiplier.getDenominator();
      numerator = num;
      denominator = denom;
  }
    
  public void divide(Rational divisor){
    //Works the same as multiply, except the operation is division
    Rational inverse = new Rational(divisor.getDenominator(), divisor.getNumerator());
    multiply(inverse); //multiplies by the inverse of the divisor
    
  }
  
  /*=====Example=of=Multiply=====
  Rational r = new Rational(2,3); //Stores the rational number 2/3
  Rational s = new Rational(1,2); //Stores the rational number 1/2
  r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2*/
  
  /*=====Main=Method=====*/
  public void (String[] args){
  	Rational test1 =  new Rational();//tests default constructor;
  	
  	System.out.println(test1);//tests toString
  	System.out.println("expected 0/1");
  	
  	Rational test2 = new Rational(7, 11);//tests overloaded constructor
  	
  	System.out.println(test2);//tests toString
  	System.out.println("expected 7/11");
  	
  	System.out.prinln(test2.floatValue);//tests floatValue
  	System.out.println("expected 0.6363...")
  	
  	Rational test3 = new Rational (13/14);//used for multiply and divide
  	
  	test.multiply(test3);//tests multiply
  	System.out.println(test2);
  	System.out.println("expected 91/154")
  	
  	test2.divide(test3);//tests divide
  	System.out.println(test);
  	Sytem.out.println("expected 1274/2002");
  	
  	
  }
}
