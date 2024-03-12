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
    public int searchAnimal(Animal animal) {
        for (Animal a : animals) {
            if (a == animal) {
                return 1;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {


        if ((searchAnimal(animal) == -1) && isZooFull()) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        int trouve = searchAnimal(animal);
        if (trouve == -1) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == animal) {
                    while (animals[i] != null) {
                        animals[i] = animals[i + 1];
                    }
                }
            }
            return true;
        }
        return false;
    }


    public boolean isZooFull(){
        int  nbAnimal =0 ;
        for (Animal animal :animals){
            nbAnimal ++ ;
        }
        return nbAnimal ==nbrCages ;
    }
    static public Zoo comparerZoo(Zoo z1, Zoo z2){
        int nbAnimal1=0;
        int nbAnimal2=0;
        for (Animal animal : z1.animals){
            nbAnimal1 ++ ;
        }
        for (Animal animal :z2.animals){
            nbAnimal2 ++ ;
        }
        if(nbAnimal1>nbAnimal2){
            return z1;
        }else {
            return z2 ;
        }


    }

}
