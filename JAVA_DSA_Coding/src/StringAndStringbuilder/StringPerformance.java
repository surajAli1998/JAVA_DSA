package StringAndStringbuilder;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++){
            /*
            first a will be converted into ascii and will be added with i and give int value
            thats why coverting into char again explicitly;
             */
            char ch = (char)('a'+i);
            /*
            now concatenating series string with each chars. Each time concatenation happens, ref variable
            series will point to newly created string obj(result of concat) and prev obj will be garbage collctd.
             */
            series = series+ch; //
        }
        System.out.println(series);
    }
}
