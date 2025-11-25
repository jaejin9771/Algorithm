import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        LinkedList<Character> l = new LinkedList<>();

        int m = sc.nextInt();
        String s = sc.next();
        
        for(int i = 0; i < s.length(); i++){
            l.add(s.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());

        sc.nextLine();
        
        for (int i = 0; i < m; i++) {
            String command = sc.next();

            switch(command) {
                case "L":
                if(it.hasPrevious()){
                    it.previous();
                }
                break;

                case "R":
                if(it.hasNext()) {
                    it.next();
                }
                break;

                case "D":
                if(it.hasNext()) {
                    it.next();
                    it.remove();
                }
                break;

                case "P":
                char c = sc.next().charAt(0);
                it.add(c);
            }
        }
        
        it = l.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}