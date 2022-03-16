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

    boolean isDeluxe(int number) {
        if (number < 10)
            return false;

        int x = number % 10;
        int auxiliar = number;

        while (auxiliar > 0) {
            if (auxiliar % 10 != x)
                return false;
            auxiliar /= 10;
        }

        return true;
    }

    public String fizzBuzz(Integer number) {
        boolean okay = false;
        String s = "";

        if (number % 3 == 0 || checkNumber(number, 3)) {
            s += "fizz";
            okay = true;
        }

        if (number % 5 == 0 || checkNumber(number, 5)) {
            if (okay)
                s += " ";

            s += "buzz";
            okay = true;
        }

        if (isDeluxe(number)) {
            if (okay)
                s += " ";

            s += "deluxe";
        }

        if (s.equals(""))
            s += number;

        return s;
    }

}


