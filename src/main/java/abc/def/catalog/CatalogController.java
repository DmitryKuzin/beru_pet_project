package abc.def.catalog;

import abc.def.catalog.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/catalog")
public class CatalogController {

    @Autowired
    private CatalogRepository catalogRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private Item2ItemDtoMapper mapper;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<ItemDto> getAllProducts(@RequestParam String categoryId) {
        List<Item> allItemsByCategory = catalogRepository.findAllByCategoryId(categoryId);
        if (allItemsByCategory != null && !allItemsByCategory.isEmpty()) {
            return allItemsByCategory.stream().map(item -> mapper.map(item)).filter(Objects::nonNull).collect(Collectors.toList());
        }
        return new ArrayList<>();

    }

    @RequestMapping(path = "/createItem", method = RequestMethod.POST)
    public String createItem(@RequestBody ItemDto itemDto, @RequestParam String categoryId) {
        itemRepository.save(
                Item.builder()
                        .id(String.valueOf(new Date().getTime()))
                        .price(Double.parseDouble(itemDto.getPrice()))
                        .name(itemDto.getName())
                        .imgPath(itemDto.getImgPath())
                        .description(itemDto.getDescription())
                        .categoryId(categoryId)
                        .build());
        return "OK";
    }
}
