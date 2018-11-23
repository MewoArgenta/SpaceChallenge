import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        Item item = new Item();
        try {
            System.out.println(item.phase1ToStack());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
