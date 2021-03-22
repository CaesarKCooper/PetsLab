import java.util.ArrayList;
import java.util.Scanner;

public class PetsLab {


    public static class Pet {


        public String kindOfPet;
        public String nameOfPet;


        public Pet(String kindOfPet, String nameOfPet) {
            this.kindOfPet = kindOfPet;
            this.nameOfPet = nameOfPet;
        }

        public String getKindOfPet() {
            return kindOfPet;
        }

        public String getNameOfPet() {
            return nameOfPet;
        }

        public String speak() {
            return "";
        }

        public static class Cat extends Pet {
            public Cat(String kindOfPet, String nameOfPet) {
                super(kindOfPet, nameOfPet);
            }

            public String speak() {
                return "meow, meow";
            }

            public static class Dog extends Pet {
                public Dog(String kindOfPet, String nameOfPet) {
                    super(kindOfPet, nameOfPet);
                }

                public String speak() {
                    return "woof, woof";
                }

                public static class Frog extends Pet {
                    public Frog(String kindOfPet, String nameOfPet) {
                        super(kindOfPet, nameOfPet);
                    }

                    public String speak() {
                        return "ribbit, ribbit";
                    }


                    public static void main(String[] args) {

                        Scanner input = new Scanner(System.in); //scanner that collects system input

                        System.out.println("How many pets do you have?");
                        int numOfPets = input.nextInt();

                        ArrayList<Pet> pets = new ArrayList<Pet>();
                        for (int i = 1; i <= numOfPets; i++) {

                            System.out.println("What kind of pet is pet #" + i + ": "); //what kind of pet is the pet at int i
                            String typeOfPet = input.next();
                            System.out.println("What is that pet's name?");
                            String nameOfPet = input.next();

                            if ("Dog".equalsIgnoreCase(typeOfPet)) {
                                pets.add(new Dog(typeOfPet, nameOfPet));
                            } else if ("Cat".equalsIgnoreCase(typeOfPet)) {
                                pets.add(new Cat(typeOfPet, nameOfPet));
                            } else if ("Frog".equalsIgnoreCase(typeOfPet)) {
                                pets.add(new Frog(typeOfPet, nameOfPet));
                            }

                        }

                        for (Pet pet : pets) {
                            System.out.println(pet.getNameOfPet() + " the " + pet.getKindOfPet() + " says " + pet.speak());
                        }
                    }
                }
            }
        }
    }
}









