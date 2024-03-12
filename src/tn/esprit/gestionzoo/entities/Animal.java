package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age>0){
            this.age = age;
        }
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("the age must be positive");
        }else {
            this.age=age;
        }
    }
}
