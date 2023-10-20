public class Main {

    public static void main(String[] args) {
        //create objects
        HashTbl hashTbl = new HashTbl();
        ArrList arrList = new ArrList();
        LinkList linkList = new LinkList();

        //run addAndRemove() method for each object
        System.out.println("Array List Running");
        arrList.addAndRemove();
        System.out.println("Array List Done Running");
        System.out.println("Linked List Running");
        linkList.addAndRemove();
        System.out.println("Linked List Done Running");
        System.out.println("Hash Table Running");
        hashTbl.addAndRemove();
        System.out.println("Hash Table Done Running");

    }
}
