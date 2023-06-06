package StringAndStringbuilder;

public class StringBasic {
    public static void main(String[] args) {
        String str1 = "suraj";
        String str2 = "suraj";
        //both are pointing to same suraj obj stored in string pool.
        System.out.println(str1==str2);//== always checks if both ref variables pint to same string obj

        String a = "ali";
        a = "surajali";
        System.out.println(a);//new obj surajali created and a will point to a and ali obj will be garbage collctd

        //we can create diff string obj of same value by using new keyword and objs will be created outside stringpool
        String name1 = new String("suraj");
        String name2 = new String("suraj");
        //here both name are diff obj created
        System.out.println(name1==name2);
        /*
        so to compare the string values we have to use equals() method, unlike == which will compare the pointing
        of both ref variables.
         */
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
