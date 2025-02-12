package basic_live_coding_lesson6.homework.api.pets.entitites.pet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@AllArgsConstructor
@Jacksonized
@NoArgsConstructor
public class Pet {
    private long id;
    private Category category;
    private List<String> photoUrls;
    private String name;
    private List<Tag> tags;
    private String status;


    @Data
    @AllArgsConstructor
    @Jacksonized
    @NoArgsConstructor
    public static class Category{
        private long id;
        private String name;
    }

    @Data
    @AllArgsConstructor
    @Jacksonized
    @NoArgsConstructor
    public static class Tag{
        private long id;
        private String name;
    }
}

