package abc.def.catalog;

import abc.def.catalog.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CatalogRepository extends MongoRepository<Item, String> {

    List<Item> findAllByCategoryId(String categoryId);
}
