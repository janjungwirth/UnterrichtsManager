package org.lecture;

import java.util.Objects;

public class Hundi {
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static class dogBuilder {
        private String name;
        private String breed;
        private int age;

        public dogBuilder name (String name){
            this.name =name;
            return this;
        }
        public dogBuilder breed (String breed){
            this.breed = breed;
            return this;
        }
        public dogBuilder age(int age){
            this.age = age;
            return this;
        }
        public Hundi build (){
            return new Hundi(name,breed,age);
        }
    }

    public Hundi(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hundi " +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hundi hundi = (Hundi) o;
        return age == hundi.age && Objects.equals(name, hundi.name) && Objects.equals(breed, hundi.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}
