//import libraries
import java.util.LinkedList;
import java.util.Random;

public class LinkList {

    public static void addAndRemove(){

        //create linked list and random objects
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random rand = new Random();

        //iterate 2,000,000 times
        for(int i = 0; i < 2000000; i++){
            //add random number to linked list
            linkedList.add(rand.nextInt());
        }
        //delete each of the 2,000,000 elements from the linkedList
        while(!linkedList.isEmpty()){
            linkedList.remove(0);
        }
    }
}
