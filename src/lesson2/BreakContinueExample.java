package lesson2;

public class BreakContinueExample {
    public static void main(String[] args) {
        int test = 10;

        while (test >0){
            System.out.println(test);
            System.out.println("...");
            test--;
            break;
        }

        while (test >0){
            System.out.println(test);
            if (test == 5){
                continue;
            }
            System.out.println("...");
            test--;
        }
        System.out.println("done");
    }
}
