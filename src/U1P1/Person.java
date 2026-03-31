package U1P1;

public class Person {

    String name;
    int age;

    public Person(String personName, int personAge){
        name = personName;
        age = personAge;
    }

    public int birthYear(){
        int birthYearOfPerson = 2026 - age;

        return birthYearOfPerson;
    }
    public String toString(){
        return "The person's name is " + name;
    }


    public static void main(String[] args) {

        Person myPerson = new Person("Gertrude", 61);

        System.out.println(myPerson);

        System.out.println(myPerson.birthYear());


    }

}




