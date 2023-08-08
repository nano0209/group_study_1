package day14;

public interface PracticeInterface{

    public static String electricCar(){
        return "Tesla";


    }
    default String SUVCar(){
        return "Highlander";

    }
    abstract String compactCar();
}
