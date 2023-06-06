package StringAndStringbuilder;

public class StringbuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        StringBuilder sb1 = new StringBuilder("suraj");
        StringBuilder sb2 = new StringBuilder("suraj");
        String a = "aa";
        a = "ab";
        System.out.println(a);
    }
}
