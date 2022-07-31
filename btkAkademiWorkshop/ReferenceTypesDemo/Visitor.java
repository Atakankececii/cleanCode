package ReferenceTypesDemo;

public class Visitor extends Person{

    private double visitorCard;

    public Visitor(){

    }

    public Visitor(int id, String firstName, double visitorCard) {
        super(id, firstName);
        this.visitorCard = visitorCard;
    }

    public double getVisitorCard() {
        return visitorCard;
    }

    public void setVisitorCard(double visitorCard) {
        this.visitorCard = visitorCard;
    }
}
