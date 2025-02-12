package basic_live_coding_lesson6.homework.api.pets.tests;

import basic_live_coding_lesson6.homework.api.pets.entitites.pet.Pet;
import basic_live_coding_lesson6.homework.api.pets.services.PetStoreService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PetStoreTest {
    private PetStoreService petStoreService = new PetStoreService();
    private Pet pet;

    @BeforeClass
    public void setup(){
        createValidPet();
        Response response = petStoreService.createPet(pet);
        Assert.assertEquals(response.getStatusCode(), 200);

        Pet createdPet = response.as(Pet.class);
        Assert.assertEquals(createdPet, pet);
    }

    @Test
    public void userCanGetPetById(){
        Response response = petStoreService.getPetById(pet.getId());
        Assert.assertEquals(response.getStatusCode(), 200);

        Pet receivedPet = response.as(Pet.class);
        Assert.assertEquals(receivedPet, pet);
    }

    @Test
    public void testUpdatePet() {
        pet.setStatus("sold");
        Response response = petStoreService.updatePet(pet);
        Assert.assertEquals(response.getStatusCode(), 200);

        Pet updatedPet = response.as(Pet.class);
        Assert.assertEquals(updatedPet.getStatus(), "sold");
    }

    @AfterClass
    public void cleanup() {
        Response response = petStoreService.deletePetById(pet.getId());
        Assert.assertEquals(response.getStatusCode(), 200);

        Response getResponse = petStoreService.getPetById(pet.getId());
        Assert.assertEquals(getResponse.getStatusCode(), 404);
    }

    private void createValidPet(){
        Pet.Category category = new Pet.Category(2, "cat");
        Pet.Tag tag = new Pet.Tag(1, "Ball");
        pet = new Pet(1, category, Arrays.asList("http"), "Tim", Arrays.asList(tag), "available");
    }

}
