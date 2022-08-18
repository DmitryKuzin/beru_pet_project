package abc.def.catalog;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDto {

    private String id;

    private String name;

    private String imgPath;

    private String description;

    private String price;

}
