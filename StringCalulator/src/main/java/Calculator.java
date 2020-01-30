import java.util.regex.*;
public class Calculator {

    // turning a string into integers
    public static int stringToInt(String num) {
    return Integer.parseInt(num);
}
    public static final String delimiter = (",|;|\n");

    public static int add(String input) throws Exception {
        if(input == "" )
        {
            return 0;
        }
        if (input.startsWith("//"))
        {
            input = input.replace("4",",");
            input = input.replace("***",",");
            int index = input.indexOf("\n");
           input = input.substring(index+1);
        }
        int number = 0;
        String[] string = input.split(delimiter);
        String negativeNumb = "";

        for (int i = 0; i < string.length ; i++) {

            if(stringToInt(string[i]) < 0)
            {
                negativeNumb += string[i] + " " ;
            }
            if(stringToInt(string[i]) >= 1000)
            {
                i++;
            }
            number += stringToInt(string[i]);
            if (!negativeNumb.isEmpty() && string[i] == string[string.length-1] )
            {
                throw new Exception("negatives not allowed: " + negativeNumb);
            }
        }
        return number;
    }
//    public static final String delimiter = ("(;|,|\n|/g)");
//
//    public static int calculate(String num) throws Exception{
//
//        String[] numbers = num.split(delimiter);
//        if (num.startsWith("//"))
//        {
//
//        }
//        if (isEmpty(num)) {
//            return 0;
//        }
//        if(num.length() == 1) {
//            return stringToInt(num);
//        }
//        else{
//            return getSum(numbers);
//        }
//    }
//// method
//    public static int getSum(String[] numbers) throws Exception
//    {
//        findException(numbers);
//        int sum = 0;
//        for (int counter = 0; counter < numbers.length; counter++) {
//            sum += stringToInt(numbers[counter]);
//        }
//        return sum;
//    }
//
//    // method finds negative numbers
//    public static void findException(String[] numbers) throws Exception {
//        for (int count = 0; count < numbers.length ; count++) {
//            if (stringToInt(numbers[count]) < 0) {
//                throw new Exception("Negative number entered!");
//            }
//        }
//    }
//
//    // caters for a empty string
//    public static boolean isEmpty(String num){
//        return num.isEmpty();
//    }
//
//    // turning a string into integers
//    public static int stringToInt(String num) {
//        return Integer.parseInt(num);
//    }
}

