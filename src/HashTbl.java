//import libraries
import java.util.Hashtable;
import java.util.Random;

public class HashTbl {

    public static void addAndRemove(){

        //create hash table and random objects
        Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
        Random rand = new Random();

        //iterate 2,000,000 times
        for(int i = 0; i < 2000000; i++){
            //add random number to hash table
            hashTable.put(rand.nextInt(), rand.nextInt());
        }
        hashTable.clear();
    }
}

