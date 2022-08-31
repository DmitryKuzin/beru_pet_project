package abc.def.catalog.item;

import abc.def.abstracts.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static abc.def.utils.Lists.isNotEmpty;

@Service
public class MongoItemService implements ItemService {

    @Autowired
    private MongoItemRepository mongoItemRepository;
    @Autowired
    private DtoMapper<Item, ItemDto> mapper;

    public List<ItemDto> getAllItemsByCategoryId(String categoryId) {
        List<Item> allItemsByCategory = mongoItemRepository.findAllByCategoryId(categoryId);
        if (allItemsByCategory != null && !allItemsByCategory.isEmpty()) {
            return allItemsByCategory.stream().map(item -> mapper.map(item)).filter(Objects::nonNull).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    @Override
    public List<ItemDto> getItemsById(String itemId) {
        List<Item> itemList = (List<Item>) mongoItemRepository.findAllById(Collections.singletonList(itemId));
        if (isNotEmpty(itemList)) {
            return itemList.stream().map(item -> mapper.map(item)).filter(Objects::nonNull).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
