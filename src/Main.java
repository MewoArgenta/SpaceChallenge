import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        ItemphasesToStacks itemphasesToStacks= new ItemphasesToStacks();
        try {
            System.out.println(itemphasesToStacks.phase2ToStack());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
