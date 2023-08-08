package day8_method_task;

public class CustomMethod {

    public static char lastCharacter(String str1){

        return str1.charAt(str1.length()-1);
    }

    public static void main(String[] args) {
       char result = lastCharacter("Naima");
        System.out.println(result);

    }



}
