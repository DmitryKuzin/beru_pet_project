package abc.def.catalog.category;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@Builder
@ToString
public class Category {

    @Id
    private String id;
    private String name;
    private Category parent;
    private List<Category> children;
}
