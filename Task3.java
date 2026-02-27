import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int number;
        boolean isHeads;

        number = random.nextInt(6) + 1;  // FIXED
        
        isHeads = random.nextBoolean();

        System.out.println("Dice Roll: " + number);
        
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
