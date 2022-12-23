package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._07_Grooming_Salon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> pets;

    public GroomingSalon(int capacity) {
        this.pets = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet ){
        if (capacity > pets.size()){
            this.pets.add(pet);
        }else {
            System.out.println("No space for new pet!");
        }
    }
    public boolean remove(String name){
        int indexToRemove = 0;
        for (Pet pet : pets) {
            if (pet.getName().equals(name)){
                indexToRemove = pets.indexOf(pet);
                pets.remove(indexToRemove);
                return true;
            }
        }
        return false;
    }
    public Pet getPet(String name, String owner){
        Pet currentPet = this.pets.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);

        return currentPet;
    }

    public int getCount(){
        return this.pets.size();
    }
    public String getStatistics(){
        StringBuilder builder = new StringBuilder("The grooming salon has the following clients:"  + System.lineSeparator());

        for (Pet pet : pets) {
            builder.append(pet.getName());
            builder.append(" ");
            builder.append(pet.getOwner());
            builder.append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
