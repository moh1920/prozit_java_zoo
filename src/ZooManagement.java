import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
//        int nbrCages = 20;
//        String zooName = "my Zoo";
//
//        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Donnez le nombre de cages : ");
//        nbrCages = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Donnez le nom du zoo : ");
//        zooName = scanner.nextLine();
//
//        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
//        scanner.close();
        ////////////////////////////////////////////////////////
        Animal lion =new Animal("lion","max",14,true);
        Zoo myZoo =new Zoo("myzoo","caf");
        Zoo belle =new Zoo("beja","111");
        System.out.println(myZoo.displayZoo());
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion.toString());
    }
}
