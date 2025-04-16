package MR.romanNumerals;

public class romanNumerals {
    public String convert(int value){
        String romanValue = "";

        while (value >= 1){
            value -= 1;
            romanValue += "I";
        }

        return romanValue;
    }
}
