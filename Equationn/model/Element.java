package Equationn.model;

public class Element {
    private float number;

    public Element() {
    }

    public Element(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Element{" + "number=" + number + '}';
    }
}
