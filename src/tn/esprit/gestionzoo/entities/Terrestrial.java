package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrlegs ;

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrlegs) {
        super(family, name, age, isMammal);
        this.nbrlegs=nbrlegs;
    }

    @Override
    public String toString() {
        return "Tresstrial{" +
                "nbrlegs=" + nbrlegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
