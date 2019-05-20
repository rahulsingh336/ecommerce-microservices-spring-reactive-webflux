package demo.ecommerce.product.repository;

import com.ecommerce.common.model.product.Product;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

    @Query("Select * from product where inventory_count = 0")
    Flux<Product> zeroInventoryProducts();

}
