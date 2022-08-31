package abc.def.catalog.item;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoItemRepository extends MongoRepository<Item, String> {

    List<Item> findAllByCategoryId(String categoryId);
}
