package StringAndStringbuilder;

public class Operators {
    public static void main(String[] args) {
        System.out.println("ab"+1);
        /*
        when an integer is concatenated with a string then it will be converted into its wrapper class Integer
        and fromm there it will call toString() and 1 will be converted into string "1"
        hence output is "ab1"
         */
    }
}
