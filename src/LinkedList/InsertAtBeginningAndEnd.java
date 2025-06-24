package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertAtBeginningAndEnd {
    public  static LinkedList<Integer>insertAtBeginning(LinkedList<Integer>list,int val){
       list.addFirst(val);
       return  list;
    }
    public static LinkedList<Integer>insertAtEnd(LinkedList<Integer>list,int val){
        list.addLast(val);
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(20);
       LinkedList<Integer>result=insertAtBeginning(list,5);


        LinkedList<Integer>lastadd=insertAtEnd(list,25);
      Iterator<Integer>li= lastadd.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }


    }
}
