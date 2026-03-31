package U1P1;

public class CelestialObject {
    private String name;
    private int diameter;
    private double mass;

    public CelestialObject(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setMass (double mass){
        this.mass = mass;
    }

    public double getMass(){
        return mass;
    }

    public String toString(){
        return "Celestial Object: " + name;
    }


}
