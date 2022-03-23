import java.io.File;

public class Tp4 {
    public static void main(String[] args) {
        File f = new File("test.txt");

        System.out.println("chemin absolu = " + f.getAbsolutePath());
        System.out.println("chemin absolu = " + f.getName());
        System.out.println("chemin absolu = " + f.exists());
        System.out.println("chemin absolu = " + f.isDirectory());
        System.err.println("chemin absolu = " + f.isFile());

    }
}
