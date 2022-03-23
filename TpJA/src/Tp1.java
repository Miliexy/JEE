import java.util.LinkedList;
import java.util.ListIterator;

public class Tp1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Liste en A:" + list);
        boolean x= true;

        ListIterator<String> listIterator = list.listIterator(list.size());
        while(x){

            listIterator.add("a");
            System.out.println("Liste en A:" + list);

            listIterator.add("b");
            System.out.println("Liste en A:" + list);

            listIterator.previous();
            listIterator.add("c");
            listIterator.add("b");
            System.out.println("Liste en A:" + list);

            listIterator.previous();
            listIterator.previous();
            listIterator.add("b");
            listIterator.add("d");
            System.out.println("Liste en A:" + list);

            listIterator= list.listIterator(list.size());
            listIterator.previous();
            listIterator.remove();
            System.out.println("Liste en A:" + list);

            listIterator= list.listIterator();
            listIterator.next();
            listIterator.next();
            listIterator.set("x");
            System.out.println("Liste en A:" + list);

            x=false;
        }


    }
}
