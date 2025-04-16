package MR.romanNumerals;

public class romanNumerals {
    public String convert(int numericValue){
        String romanValue = "";
        int[] numericList = {10, 1};
        String[] romanList = {"X", "I"};

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
