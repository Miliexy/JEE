import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class tp2 {

    public static void main(String[] args) {
        String st = "test1 test2 test3";
        //Scanner sc = new Scanner(System.in);

        LinkedList<String> lt= new LinkedList<>();
        ListIterator<String> lit = lt.listIterator(lt.size());

        //st = sc.next();
        String[] stl = st.split(" ");
        for (int i = 0; i < stl.length; i++) {
            lit.add(stl[i]);
            lit.previous();
        }

        System.out.println(lt);
        while(lit.hasNext())
        {System.out.println(lit.next());}

    }
}
