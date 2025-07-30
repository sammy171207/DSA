package LinkedList.DoublyLinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class Insert {
    static void insertAtPosition(LinkedList<Integer>list,int position,int val){
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
            return;
        }
        list.add(position, val);

    }


    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        insertAtPosition(list,3,21);
        Iterator<Integer>it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
