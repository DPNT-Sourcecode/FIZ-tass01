package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    boolean checkNumber(int number, int x){
        int auxiliar = number;

        while(auxiliar > 0){
            if(auxiliar % 10 == x)
                return true;
            auxiliar /= 10;
        }

        return false;
    }

    public String fizzBuzz(Integer number) {
        if (number % 15 == 0)
            return "fizz buzz";
        else if (number % 5 == 0)
            return "buzz";
        else if (number % 3 == 0)
            return "fizz";

        return "" + number;
    }

}


