package day4;

public class LastIndex {
    public static void main(String[] args) {

        String str = "School";
                   // 012345
        System.out.println(str.length());

        // last  character of the word
        String lastChar = "" + str.charAt(str.length()-1);
        System.out.println(lastChar);

        //  last index of "l"
        System.out.println(str.lastIndexOf("l")); // -- > 5

    }
}
