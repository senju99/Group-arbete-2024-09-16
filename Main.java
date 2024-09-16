import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Välkommen till JU24's Kök! Vi har följande mat på menyn:
                
                1. Kebabpizza
                2. Pasta
                3. Kebabtallrik
                4. Husmanskost
                5. Max Hamburgare
                6. Sushi
                7. Pad Thai
                """);

        int userChoice;

        do {
            System.out.println("Vad är din favorit mat?");
            userChoice = input.nextInt();
            if (userChoice == 0){
                System.out.println("0 är fel val. Vad är din favorit mat? ");
            }
        } while (userChoice == 0);

        switch (userChoice) {
            case 1:
                System.out.println("Din favorit mat är Kebabpizza");
                break;
            case 2:
                System.out.println("Din favorit mat är Pasta");
                break;
            case 3:
                System.out.println("Din favorit mat är Kebabtallrik");
                break;
            case 4:
                System.out.println("Din favorit mat är Husmanskost");
                break;
            case 5:
                System.out.println("Din favorit mat är Max Hamburgare");
                break;
            case 6:
                System.out.println("Din favorit mat är Sushi");
                break;
            case 7:
                System.out.println("Din favorit mat är Pad Thai");
                break;
            default:
                System.out.println("Det alternativet finns inte...");
        }
    }
}
