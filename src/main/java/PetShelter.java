import java.util.Queue;
import java.util.LinkedList;

public class PetShelter implements Shelter {

    private Queue<Pet> cats = new LinkedList<>();
    private Queue<Pet> dogs = new LinkedList<>();

    private int priority = 0;

    @Override
    public void addDog(String dogName) {
        dogs.add(new Pet(dogName, ++priority));
    }

    @Override
    public void addCat(String catName) {
        cats.add(new Pet(catName, ++priority));
    }

    @Override
    public String getDog() {
        Pet dog = dogs.poll();
        return dog != null ? dog.getName() : null;
    }

    @Override
    public String getCat() {
        Pet cat = cats.poll();
        return cat != null ? cat.getName() : null;
    }

    @Override
    public String getPet() {
        Pet cat = cats.peek();
        Pet dog = dogs.peek();

        if (cat != null && dog != null) {
            return cat.getPriority() < dog.getPriority() ?
                    cats.remove().getName() : dogs.remove().getName();
        }
        else if(dog != null) {
            return dogs.remove().getName();
        }
        else if (cat != null) {
            return cats.remove().getName();
        }

        return null;
    }
}
