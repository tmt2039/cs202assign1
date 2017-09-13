
public class Factorial
{

    public static int factorial (int number){
        if (number == 0){

            return 1;

        } else {

            return number * factorial(number - 1);

        }

    }

    public static int iterationFactorial(int number) {
        int product = 1;
        while (number > 0) {

            product = product * (number);
            number = number - 1;
        }
        if(product != 0)
        return product;
        else
            return 1;
    }


}
