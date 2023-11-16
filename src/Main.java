import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // teste 1
       /* Bear simpleBear = new Bear("SimpleBear");
        for (int i = 0; i < 105; i++) {
            simpleBear.talk();
        } */

        // teste 2
        /*
        Bear crankyBear = new Bear("CrankyBear");
        for (int i = 0; i < 105; i++) {
            crankyBear.talk();
        }*/
        //teste 3
        //Bear drunkBear = new Bear("DrunkBear");
        //while (drunkBear.getBatteryLevel() > 0) {
        //    drunkBear.talk();
        //}


        Scanner scan = new Scanner(System.in);
        int userChoice = 0;

        Bear bear = new Bear("");
        Shop shop = new Shop();

        System.out.println("PICK A BEAR");
        do {
            System.out.println("1 - Simple Bear");
            System.out.println("2 - Cranky Bear");
            System.out.println("3 - Drunk Bear");
            System.out.println("4 - View Shop");
            System.out.println("0 - Exit");

            userChoice = scan.nextInt();
            scan.nextLine();

            switch (userChoice) {
                case 1:
                    Bear simpleBear = new Bear("SimpleBear");
                    simpleBear.talk();
                    break;
                case 2:
                    Bear crankyBear = new Bear("CrankyBear");
                    crankyBear.talk();
                    break;
                case 3:
                    Bear drunkBear = new Bear("DrunkBear");
                    drunkBear.talk();
                    break;
                case 4:
                    shop.bearNumber();
                    break;
                case 0:
                    System.out.println("Off you go");
                    break;
                default:
                    System.out.println("You didn't pick a bear");
                    break;
            }
        } while (userChoice != 0);
    }
}