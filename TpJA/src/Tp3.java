import java.util.HashSet;

public class Tp3 {


    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        addSet(set,2);
        addSet(set,5);
        addSet(set,-6);
        addSet(set,2);
        addSet(set,-8);
        addSet(set,9);
        addSet(set,5);
        System.out.println(set);
        removeSet(set,5);
        System.out.println(set);
        removeSet(set,5);


    }

    static void addSet(HashSet<Integer> set, int a){
        if(set.add(a)) System.out.println("On ajoute "+ a);
        else System.out.println(a + " est deja present");
    }

    static void removeSet(HashSet<Integer> set, int a){
        if(set.remove(a)) System.out.println("On supprime "+ a);
        else System.out.println(a + " n'existe pas");
    }


}
