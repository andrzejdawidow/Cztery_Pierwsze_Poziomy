import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public double substractAFromB(double a, double b) {
                return a - b;
	}
}

class Application
{
        public static void main (String[] args) throws java.lang.Exception {

                Codechef simpleCalculator = new Codechef();

                double result = simpleCalculator.substractAFromB(10.8, 6.4);
                System.out.println("wynik to: " + result);
        }
}