import java.util.*;

public class Patttern {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println("s");
        }
        for (int i = 3; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}