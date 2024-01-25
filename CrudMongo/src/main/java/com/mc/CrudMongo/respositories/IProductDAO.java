package com.mc.CrudMongo.respositories;

import com.mc.CrudMongo.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
}
