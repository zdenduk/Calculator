package cz.zdenduk.steps;

public class PlusStep implements Step {
    private int number;

    public PlusStep(int number) {
        this.number = number;
    }

    @Override
    public int calculate(int val) {
        return val + this.number;
    }

    @Override
    public String toString() {
        return "+" + number;
    }
}
