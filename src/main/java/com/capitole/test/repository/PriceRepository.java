package com.capitole.test.repository;

import com.capitole.test.repository.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

  @Query("""
      SELECT p
      FROM Price p
      WHERE :date
      BETWEEN p.startDate AND p.endDate
      AND :brandId = p.brandId
      AND :productId = p.productId
      """)
  Price findByFilterParams(@Param("date") String date, @Param("brandId") Long brandId,
      @Param("productId") Long productId);

}
