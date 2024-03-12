import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my Zoo";

        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez le nombre de cages : ");
        nbrCages = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Donnez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);

        scanner.close();
    }
}
