//import libraries
import java.util.ArrayList;
import java.util.Random;

public class ArrList {

    public static void addAndRemove(){

        //crate array list and random objects
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random rand = new Random();

        //iterate 2,000,000 times
        for(int i = 0; i < 2000000; i++){
            //add random number to array list
            arrayList.add(rand.nextInt());
        }
        //delete each of the 2,000,000 elements from the arrayList
        while(!arrayList.isEmpty()){
            arrayList.remove(0);
        }
    }



}
