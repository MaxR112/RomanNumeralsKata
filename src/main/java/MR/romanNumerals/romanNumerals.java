package MR.romanNumerals;

public class romanNumerals {
    public String convert(int numericValue){
        String romanValue = "";
        int[] numericList = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanList = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

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
