package abc.def.catalog.category;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getCategoriesById(String categoryId);
}
