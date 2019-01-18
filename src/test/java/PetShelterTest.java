import org.junit.Test;

import static org.junit.Assert.*;

public class PetShelterTest {

    @Test
    public void  shouldReturnTheAddedDogIfTheresNoMoreDogs() {
        Shelter shelter = new PetShelter();
        shelter.addDog("dog1");
        assertEquals(shelter.getDog(), "dog1");
    }

    @Test
    public void shouldReturnFirstAddedDogsWhenAddMultipleDogs() {
        Shelter shelter = new PetShelter();
        shelter.addDog("dog1");
        shelter.addDog("dog2");
        assertEquals(shelter.getDog(), "dog1");
    }

    @Test
    public void shouldReturnNullWhenCallGetDogIfTheresNoDogs() {
        Shelter shelter = new PetShelter();
        assertNull(shelter.getDog());
    }

    @Test
    public void shouldReturnTheRightPetsForTheGivenSequenceOfInstructions() {
        Shelter shelter = new PetShelter();
        shelter.addDog("dog1");
        shelter.addDog("dog2");
        shelter.addCat("cat1");
        assertEquals(shelter.getCat(), "cat1");
    }

    @Test
    public void shouldReturNullForGetCatWhenNoCatsRemains() {
        Shelter shelter = new PetShelter();
        assertNull(shelter.getCat());
    }


    @Test
    @SuppressWarnings("Duplicates")
    public void shouldReturnExpectedCatsOrDogsForTheGivenSetOfInstructions() {
        Shelter shelter = new PetShelter();

        // Adding pets to shelter
        shelter.addDog("dog1");
        shelter.addDog("dog2");
        shelter.addDog("dog3");
        shelter.addCat("cat1");
        shelter.addCat("cat2");
        shelter.addDog("dog4");
        shelter.addCat("cat3");
        shelter.addCat("cat4");

        // Retrieving pets from shelter
        assertEquals(shelter.getDog(), "dog1");
        assertEquals(shelter.getCat(), "cat1");
        assertEquals(shelter.getPet(), "dog2");
        assertEquals(shelter.getPet(), "dog3");
        assertEquals(shelter.getPet(), "cat2");
        assertEquals(shelter.getPet(), "dog4");
        assertEquals(shelter.getPet(), "cat3");
        assertNull(shelter.getDog());
        assertEquals(shelter.getCat(), "cat4");
        assertNull(shelter.getCat());
        assertNull(shelter.getPet());
    }
}