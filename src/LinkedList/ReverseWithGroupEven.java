package LinkedList;

import java.util.*;

public class ReverseWithGroupEven {

    static List<Integer> reverse(LinkedList<Integer> li) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int groupSize = 1;

        while (i < li.size()) {
            int end = Math.min(i + groupSize, li.size());
            List<Integer> group = li.subList(i, end);
            List<Integer> temp = new ArrayList<>(group);

            if (temp.size() % 2 == 0) {
                Collections.reverse(temp);
            }

            result.addAll(temp);
            i = end;
            groupSize++;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> given = new LinkedList<>();
        given.add(1);
        given.add(0);
        given.add(1);
        given.add(6);

        List<Integer> sol = reverse(given);
        for (int num : sol) {
            System.out.print(num + " ");
        }
    }
}
