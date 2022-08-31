package abc.def.catalog.category;

import abc.def.abstracts.DtoMapper;
import abc.def.utils.Lists;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

import static abc.def.utils.Lists.isNotEmpty;

@Component
public class Category2CategoryDtoMapper implements DtoMapper<Category, CategoryDto> {

    @Override
    public CategoryDto map(Category obj) {
        if (obj == null) {
            return null;
        }
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(obj.getId());
        categoryDto.setName(obj.getName());
        categoryDto.setIsHeadCategory(obj.getParent() == null);
        categoryDto.setParentId(obj.getParent() != null ? obj.getParent().getId() : null);
        categoryDto.setChildrenIdList(
                isNotEmpty(obj.getChildren()) ?
                        obj.getChildren().stream().filter(Objects::nonNull).map(Category::getId).collect(Collectors.toList()) : null
        );

        return categoryDto;
    }
}
