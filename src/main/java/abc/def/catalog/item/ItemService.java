package abc.def.catalog.item;

import java.util.List;

public interface ItemService {

    List<ItemDto> getAllItemsByCategoryId(String categoryId);

    List<ItemDto> getItemsById(String itemId);
}
