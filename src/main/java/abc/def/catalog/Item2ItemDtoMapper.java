package abc.def.catalog;

import abc.def.catalog.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class Item2ItemDtoMapper {

    public ItemDto map(Item item) {
        if (item == null) {
            return null;
        }
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setPrice(String.valueOf(item.getPrice()));
        itemDto.setImgPath(item.getImgPath());
        return itemDto;
    }
}
