package com.inditex.domain.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "prices")
@Data
@SuperBuilder
@NoArgsConstructor
public class PriceEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "brand_id")
  private Long brandId;

  @Column(name = "start_date")
  private ZonedDateTime startDate;

  @Column(name = "end_date")
  private ZonedDateTime endDate;

  @Column(name = "price_list")
  private Long priceList;

  @Column(name = "product_id")
  private Long productId;

  @Column(name = "priority")
  private Long priority;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "curr")
  private String curr;

}
