package MR.romanNumerals;

public class romanNumerals {
    public String convert(int value){
        String romanValue = "";

        if (value < 0){
            throw new NegativeIntegerException();
        }else{
            while (value >= 10){
                value -= 10;
                romanValue += "X";
            }
            while (value >= 1){
                value -= 1;
                romanValue += "I";
            }
        }

        return romanValue;
    }

    class NegativeIntegerException extends RuntimeException{}
}
