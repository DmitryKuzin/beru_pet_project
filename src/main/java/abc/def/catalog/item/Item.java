package abc.def.catalog.item;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@ToString
public class Item {

    @Id
    private String id;

    private String name;

    private String categoryId;

    private String imgPath;

    private String description;

    private Double price;


}
