import java.util.*;
import java.lang.*;
import java.io.*;

class Animal
{
        private String eat;
        private String drink;

        public Animal(String eat, String drink) {
                this.eat = eat;
                this.drink = drink;
        }

        public String getEat() {
                return this.eat;
        }

        public String getDrink() {
                return this.drink;
        }
}

class Dog extends Animal
{
        private String breed;

        public Dog(String breed, String eat, String drink) {
                super(eat, drink);
                this.breed = breed;
        }
        public String getBreed() {
        	return this.breed;
        }

        public void buy() {

        }

        public void sell() {

        }
}

class Aplication {

        public static void main(String[] args) {

                Dog dog = new Dog("owczarek", "mieso", "woda");
                String eat = dog.getEat();
                String drink = dog.getDrink();
                String breed = dog.getBreed();

                System.out.println(breed + " " + eat +" " + drink);

        }
}