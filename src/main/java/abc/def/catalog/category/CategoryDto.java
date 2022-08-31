package abc.def.catalog.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDto {

    private String id;
    private String name;
    private String parentId;
    private List<String> childrenIdList;
    private Boolean isHeadCategory;

}
