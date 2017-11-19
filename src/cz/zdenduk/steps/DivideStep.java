package cz.zdenduk.steps;

public class DivideStep implements Step {
    private int number;

    public DivideStep(int number) {
        this.number = number;
    }

    @Override
    public int calculate(int val) {
        return val / this.number;
    }

    @Override
    public String toString() {
        return "/" + number;
    }
}
