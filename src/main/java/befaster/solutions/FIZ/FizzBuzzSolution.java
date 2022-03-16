package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    boolean checkNumber(int number, int x) {
        int auxiliar = number;

        while (auxiliar > 0) {
            if (auxiliar % 10 == x)
                return true;
            auxiliar /= 10;
        }

        return false;
    }

    public String fizzBuzz(Integer number) {

        if (number % 3 == 0 && checkNumber(number, 3) && (number % 5 == 0 && checkNumber(number, 5)))
            return "fizz buzz";
        else if (number % 3 == 0 && checkNumber(number, 3))
            return "fizz";
        else if (number % 5 == 0 && checkNumber(number, 5))
            return "buzz";
        else return "" + number;
    }

}



