package com.inditex.domain;

import com.inditex.domain.model.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

  @Query(value = """
      SELECT *
      FROM PRICES
      WHERE :date
      BETWEEN START_DATE AND END_DATE
      AND :brandId = BRAND_ID
      AND :productId = PRODUCT_ID
      ORDER BY PRIORITY DESC
      LIMIT 1;
      """, nativeQuery = true)
  PriceEntity findByFilterParams(@Param("date") ZonedDateTime date, @Param("brandId") Long brandId,
                                 @Param("productId") Long productId);

}
