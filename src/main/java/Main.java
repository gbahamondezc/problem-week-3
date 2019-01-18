public class Main {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Shelter shelter = new PetShelter();

        shelter.addDog("dog1");
        shelter.addDog("dog2");
        shelter.addDog("dog3");
        shelter.addCat("cat1");
        shelter.addCat("cat2");
        shelter.addDog("dog4");
        shelter.addCat("cat3");
        shelter.addCat("cat4");

        System.out.println(shelter.getDog());
        System.out.println(shelter.getCat());
        System.out.println(shelter.getPet());
        System.out.println(shelter.getPet());
        System.out.println(shelter.getPet());
        System.out.println(shelter.getPet());
        System.out.println(shelter.getPet());
        System.out.println(shelter.getDog());
        System.out.println(shelter.getCat());
        System.out.println(shelter.getCat());
        System.out.println(shelter.getPet());
    }
}
