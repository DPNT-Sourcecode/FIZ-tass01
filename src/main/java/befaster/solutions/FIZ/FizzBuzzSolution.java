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

    boolean isDeluxe(int number){
        if(number < 10)
            return false;

        int x = number % 10;
        int auxiliar = number;

        while(auxiliar > 0){
            if(auxiliar % 10 != x)
                return false;
            auxiliar /= 10;
        }

        return true;
    }

    public String fizzBuzz(Integer number) {
        boolean ok = false;

        if (number % 3 == 0 || checkNumber(number, 3)) {
            return "fizz";
            ok = true;
        }
        else if (number % 5 == 0 || checkNumber(number, 5))
            return "buzz";
        else return "" + number;
    }

}

