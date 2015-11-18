//Emax Electronic Arts -- Lorenz "Big L" Vargas, Elias "RzrWire" Milborn
//APCS pd10
//HW32 -- Irrationality Stops Here
//2015-11-17

public class Rational {
    //instance vars
    private double numerator;
    private double denominator;

    //constructors
    public Rational() {
	this(0,1);
    }//end basic constructor

    public Rational(double num, double denom) {
	denominator = denom;
	numerator = num;
	if (denom == 0) {
	    System.out.println("Error. Invalid denominator. Setting numerator to 0 and denominator to 1.");
	    numerator = 0;
	    denominator = 1;
	}
    }//end constructor
}//end class
