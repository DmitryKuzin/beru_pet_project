package abc.def.catalog.category;

import abc.def.abstracts.DtoMapper;
import abc.def.catalog.item.Item;
import abc.def.catalog.item.ItemDto;
import abc.def.utils.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static abc.def.utils.Lists.isNotEmpty;

@Service
public class MongoCategoryService implements CategoryService {

    @Autowired
    private MongoCategoryRepository mongoCategoryRepository;
    @Autowired
    private DtoMapper<Category, CategoryDto> mapper;

    public List<CategoryDto> getCategoriesById(String categoryId) {
        List<Category> categoriesList = (List<Category>) mongoCategoryRepository.findAllById(Collections.singletonList(categoryId));
        if (isNotEmpty(categoriesList)) {
            return categoriesList.stream().map(cat -> mapper.map(cat)).filter(Objects::nonNull).collect(Collectors.toList());
        }
        return new ArrayList<>();

    }
}
