package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal{
    private  String habitat ;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public abstract void swim() ;
    public boolean equals(Aquatic o) {
        if (this.name == o.name && this.age==o.age && this.habitat==o.habitat) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(habitat, aquatic.habitat);
    }

}
