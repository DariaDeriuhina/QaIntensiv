package basic_live_coding_lesson6.homework.api.pets.services;

import basic_live_coding_lesson6.homework.api.pets.entitites.pet.Pet;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetStoreService {

    public static String BASE_URI = "https://petstore.swagger.io/v2";

    public PetStoreService() {
        RestAssured.baseURI = BASE_URI;
    }

    public Response createPet(Pet pet){
        return RestAssured.given().contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("/pet");
    }

    public Response updatePet(Pet pet){
        return RestAssured.given().contentType(ContentType.JSON)
                .body(pet)
                .when()
                .put("/pet");
    }

    public Response getPetById(long petId){
        return RestAssured.given().contentType(ContentType.JSON)
                .pathParam("petId", petId)
                .when()
                .get("/pet/{petId}");
    }

    public Response deletePetById(long petId){
        return RestAssured.given().contentType(ContentType.JSON)
                .pathParam("petId", petId)
                .when()
                .delete("/pet/{petId}");
    }


}
