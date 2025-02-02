package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // (3) in this proccess we will add a continuous looping state--
        boolean promptLoop = true;

        // New Things added (while loop)
        // to make the prompt infinite unlesss terminated by 3
        while (promptLoop) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    // (2) System output dog's breed is displayed
                    System.out.println("Dog's breed is: " + ((Dog) pet).getBreed());
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    //(2) System output cat's lives is displayed
                    System.out.println("Number of lives is: " + ((Cat) pet).getNoOfLives());
                    break;
                case 3:
                    // (3) terminating option
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice, please try again.");
                    // if invalid for all cases

            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());

        }
    }
}
