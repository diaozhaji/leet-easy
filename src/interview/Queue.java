package interview;

import java.util.ArrayList;
import java.util.List;

public class Queue {


    int index = 0;
    Data head = new Data();
    Data cur = head;

    public int dequeue() {
        if (head == null || index >= head.data.size()) {
            throw new RuntimeException("Queue为空");
        }

        int res = head.data.get(index);
        index++;
        if (index > 4) {
            head = head.next;
            index = 0;
        }

        return res;
    }

    public void enqueue(int a) {


        if (cur.data.size() < 5) {
            cur.data.add(a);
            return;
        }

        if (cur.data.size() == 5) {
            Data newData = new Data();
            cur.next = newData;
        }

        while (cur.data.size() >= 5) {
            cur = cur.next;
        }
        cur.data.add(a);

    }

    class Data {

        Data next;
        List<Integer> data = new ArrayList<>(5);

    }
}
