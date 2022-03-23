import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class Tp5 {
    public static void main(String[] args) {
        FileInputStream fis;
        BufferedInputStream bis;
        try{
            fis = new FileInputStream(new File("result.html"));
            bis = new BufferedInputStream(new FileInputStream(new File("result.html")));
            byte[] but = new byte[8];
            long startTime = System.currentTimeMillis();
            while(fis.read() != -1) {
                System.out.println("working...");
            };
            System.out.println("temp de lecture file = " + (System.currentTimeMillis()-startTime));
            startTime = System.currentTimeMillis();
            while(bis.read(but) != -1) {
                System.out.println("working...");
            };
            System.out.println("temp de lecture buffer" + (System.currentTimeMillis()-startTime));
            fis.close(); bis.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
