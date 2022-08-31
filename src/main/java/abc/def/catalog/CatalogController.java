package abc.def.catalog;

import abc.def.catalog.category.CategoryDto;
import abc.def.catalog.category.CategoryService;
import abc.def.catalog.item.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/catalog")
public class CatalogController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<CategoryDto> getCategoryById(@RequestParam String categoryId) {
        return categoryService.getCategoriesById(categoryId);
    }

    @RequestMapping(path = "/itemsByCategory", method = RequestMethod.GET)
    public List<ItemDto> getAllItemsByCategoryId(@RequestParam String categoryId) {
        return itemService.getAllItemsByCategoryId(categoryId);
    }

    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public List<ItemDto> getItemById(@RequestParam String itemId) {
        return itemService.getItemsById(itemId);
    }
//
//    @RequestMapping(path = "/createItem", method = RequestMethod.POST)
//    public String createItem(@RequestBody ItemDto itemDto, @RequestParam String categoryId) {
//        itemRepository.save(
//                Item.builder()
//                        .id(String.valueOf(new Date().getTime()))
//                        .price(Double.parseDouble(itemDto.getPrice()))
//                        .name(itemDto.getName())
//                        .imgPath(itemDto.getImgPath())
//                        .description(itemDto.getDescription())
//                        .categoryId(categoryId)
//                        .build());
//        return "OK";
//    }
}
