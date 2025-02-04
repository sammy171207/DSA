package String;

public class Occurence {
    static int firstOccurence(String txt, String pat) {
        return txt.indexOf(pat);

    }
    public static void main(String[] args) {
   String str="GeeksForGeeks";
   String pat="gr";
   int out=firstOccurence(str,pat);
        System.out.println(out);
    }
}
