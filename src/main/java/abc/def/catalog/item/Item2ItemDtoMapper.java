package abc.def.catalog.item;

import abc.def.abstracts.DtoMapper;
import org.springframework.stereotype.Component;

@Component
public class Item2ItemDtoMapper implements DtoMapper<Item, ItemDto> {

    @Override
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
