package U1P1;

public class Planet extends CelestialObject {
    private int distance; // in Astronomical Units
    private double orbitTime; // earth years for the orbit
    private double eccentricity;

    public Planet(String planetName){
        super(planetName);
    }



    public double planetDensity(){
        double radius = (double)super.getDiameter()/2;
        double volume =  3.141592653 * 4/3* (Math.pow(radius,3));

        return super.getMass()/ volume;

    }

    @Override
    public String toString(){
        return "Planet Name: " + super.getName();
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth");

        System.out.println(earth);

    }



}
