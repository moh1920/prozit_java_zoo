package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    Aquatic[] aquaticAnimals;

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
    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("then name is empty");
        } else {
            this.name = name;
        }
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if(aquaticAnimals[-1]==null){
            for(int i=0;i<aquaticAnimals.length;i++){
                if(aquaticAnimals[i]==null){
                    aquaticAnimals[i]=aquatic;
                }
            }
            System.out.println("add succesfull");
        }else {
            System.out.printf("erreur add");
        }
    }
    public float maxPenguinSwimmingDepth(){
        float[] swimmingDepth=new float[10];
        int i=0;
        float mawDepth=0 ;
        for (Aquatic penguin:aquaticAnimals){
            if(penguin instanceof Penguin){
                swimmingDepth[i]=((Penguin) penguin).getSwimmingDepth();
                i++;
            }
        }
        for(int j=0;j<swimmingDepth.length;j++){
            if(swimmingDepth[j]>swimmingDepth[j+1]){
                mawDepth=swimmingDepth[j];
            }
        }
        return mawDepth ;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrDauphins=0;
        int nbrPinguins=0;
        for (Aquatic aquatic :aquaticAnimals){
            if(aquatic instanceof Dolphin){
                nbrDauphins++;
            }
            if(aquatic instanceof Penguin){
                nbrPinguins++;
            }
        }
        System.out.printf("number of dolphin "+nbrDauphins+" number of pinguin "+nbrPinguins);
    }

}
