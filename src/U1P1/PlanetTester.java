package U1P1;

public class PlanetTester {

    public static void main(String[] args) {

        Moon moon = new Moon("Moon", "Earth");

        System.out.println(moon);

        Planet mars = new Planet("Mars");
       System.out.println(mars);

       mars.setMass( 6.39e23);
       mars.setDiameter(6779000);

        System.out.println(mars.planetDensity());



    }

}
