package day14;

public class RegPractice extends Practice implements PracticeInterface{
    @Override
    public String name(String name) {
        return null;
    }

    @Override
    public String language() {
        return super.language();
    }

    @Override
    public String SUVCar() {
        return PracticeInterface.super.SUVCar();
    }

    @Override
    public void age() {

    }

    @Override
    public String compactCar() {
        return null;
    }
}
