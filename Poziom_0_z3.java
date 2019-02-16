import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SimpleCalculator
{
        public int addAToB(int a, int b) {
                return a + b;
        }

        public double substractAFromB(double a, double b) {
                return a - b;
        }
}

class Application
{
        public static void main(String[] args) {

                SimpleCalculator simpleCalculator = new SimpleCalculator();

                double result = simpleCalculator.substractAFromB(5.5, 5.0);
                System.out.println(result);
        }
}
