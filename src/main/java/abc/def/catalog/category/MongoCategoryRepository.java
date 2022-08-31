package abc.def.catalog.category;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface MongoCategoryRepository extends MongoRepository<Category, String> {

}
