package MR.romanNumerals;

public class romanNumerals {
    public String convert(int numericValue){
        String romanValue = "";

        if (numericValue < 0){
            throw new NegativeIntegerException();
        }else{
            while (numericValue >= 10){
                numericValue -= 10;
                romanValue += "X";
            }
            while (numericValue >= 1){
                numericValue -= 1;
                romanValue += "I";
            }
        }

        return romanValue;
    }

    class NegativeIntegerException extends RuntimeException{}
}
