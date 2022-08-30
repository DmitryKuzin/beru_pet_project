package abc.def.catalog.category;

import abc.def.catalog.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoryRepository extends MongoRepository<Category, String> {

}
