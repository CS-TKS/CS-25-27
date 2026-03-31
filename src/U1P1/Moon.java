package U1P1;

public class Moon extends CelestialObject{
    private String planetInOrbitOf;
    private int distanceToSurface;

    public Moon(String name, String planetInOrbitOf){
        super(name);
        this.planetInOrbitOf = planetInOrbitOf;

    }

    @Override
    public String toString(){
        String myReturn = "Name: " + super.getName() + "\n";
        myReturn = myReturn + "Planet in Orbit of: " + planetInOrbitOf;
        return myReturn;
    }

}
