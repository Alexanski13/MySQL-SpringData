package advancedqueries.domain.repositories;

import advancedqueries.domain.entities.Shampoo;
import advancedqueries.domain.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {
    List<Shampoo> findByBrand(String brand);

    List<Shampoo> findByBrandAndSize(String brand, Size size);

    List<Shampoo> findBySizeOrderByIdDesc(Size size);

    @Query(value = "select s from Shampoo as s join s.ingredients as i where i.name = :ingredient")
    List<Shampoo> findByIngredient(String ingredient);

    @Query(value = "select s from Shampoo as s join s.ingredients as i where i.name in :ingredients")
    List<Shampoo> findByIngredients(List<String> ingredients);

    List<Shampoo> findBySizeOrLabelId(Size parsed, long labelId);

    List<Shampoo> findByPriceGreaterThanOrderByPriceDesc(BigDecimal price);

    long countByPriceLessThan(BigDecimal price);

    @Query("select s from Shampoo as s where s.ingredients.size < :count")
    List<Shampoo> findByIngredientCountLessThan(int count);
}
