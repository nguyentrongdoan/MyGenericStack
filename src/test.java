import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Queue<Integer> arr = new LinkedList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);


        for (Integer s: arr){
            System.out.println(s);
        }
        System.out.println("Sau khi xoa: ");
//        arr.remove();
//        arr.remove(3);
//        arr.poll();

//        System.out.println(arr.peek());
//        arr.offer(9);
        System.out.println(arr.element());
        for (Integer s: arr){
            System.out.print(s + " ");
        }
    }

}
