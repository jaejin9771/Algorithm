import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            // Please write your code here.
            switch (command) {
                case "push_front":
                a = sc.nextInt();
                list.addFirst(a);
                break;

                case "push_back":
                a = sc.nextInt();
                list.addLast(a);
                break;

                case "pop_front":
                System.out.println(list.pollFirst());
                break;

                case "pop_back":
                System.out.println(list.pollLast());
                break;

                case "size":
                System.out.println(list.size());
                break;

                case "empty":
                if(list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;

                case "front":
                System.out.println(list.peekFirst());
                break;

                case "back":
                System.out.println(list.peekLast());
                break;
            }

        }
    }
}