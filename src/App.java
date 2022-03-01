import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("------------------------");
            System.out.println();
            System.out.println("1) Program indítása.");
            System.out.println("");
            System.out.println("2) Névjegy");
            System.out.println("");
            System.out.println("3) Kilépés");

            System.out.println();
            System.out.println();
            System.out.print("Választás: ");
            String valasztott = scan.nextLine();
        }


    }
}
