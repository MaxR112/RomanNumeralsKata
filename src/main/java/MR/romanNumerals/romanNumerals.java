package MR.romanNumerals;

public class romanNumerals {
    public String convert(int numericValue){
        String romanValue = "";
        int[] numericList = {100, 90, 10, 9, 4, 1};
        String[] romanList = {"C", "XC", "X", "IX", "IV", "I"};

        if (numericValue < 0){
            throw new NegativeIntegerException();
        }else{
            for (int i = 0; i < romanList.length; i++){
                while (numericValue >= numericList[i]){
                    numericValue -= numericList[i];
                    romanValue += romanList[i];
                }
            }
        }

        return romanValue;
    }

    class NegativeIntegerException extends RuntimeException{}
}
