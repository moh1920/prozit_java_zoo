import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int nbrCages =25 ;
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public String displayZoo() {
        return name + " comporte " + nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

}
