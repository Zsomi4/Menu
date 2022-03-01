import java.util.Scanner;

public class App { 

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Gubis Zsombor dániel, 2022.02.23.");
            //Menü
            String valasztott = "";
            do {
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
                valasztott = scan.nextLine();         
            switch(valasztott) {
                case "1":
                    System.out.println("Első a választott.");
                    //Négyzetgyök program.
                    double szam = 0;            
                    do {
                        System.out.print("Szám: ");
                        szam = scan.nextDouble();
        
                        if (szam != 0) {
                            double gyok = Math.sqrt(szam);
                            System.out.println("------------------------------");
                            System.out.printf("| Szám négyzetgyöke: %.2f\n", gyok, "|");
                            System.out.println("------------------------------");
                        }
                    }while(szam != 0);
                    System.out.println("Folytatáshoz Enter.");
                    scan.nextLine(); //Enter olvasása
                    scan.nextLine();
                    break;
                case "2":
                    System.out.println("Második a választott.");
                    System.out.println("Gubis Zsombor Dániel");
                    System.out.println("2022.03.01");
                    System.out.println("Gyökszámítás");
                    System.out.println("Folytatáshoz Enter");
                    scan.nextLine();
                    break;
                case "3":
                    System.out.println("Kilépés a programból.");
                    break;
            }
        }while(!valasztott.equals("3"));
            //Vége
        }

    }
}
