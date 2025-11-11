package U1P1;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(90);
        grades.add(67);
        grades.add(20);
        grades.remove(2);
        grades.set(1,77);
        grades.add(99);
        grades.add(81);
        grades.add(61);
        grades.add(100);
        //https://classroom.github.com/a/CGVqEs4K

        for(int i=0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }

        //grades.clear();

        int searchValue = 73;
        int foundPos = -1;



        for(int i=0; i<grades.size(); i++){
            if(grades.get(i)==searchValue){
                foundPos=i;
            }


        }

        if(foundPos !=-1){
            System.out.println("The value of : "+searchValue+" was found in position: " + foundPos);
        }else{
            System.out.println("Value was not found!");
        }



    }


}
