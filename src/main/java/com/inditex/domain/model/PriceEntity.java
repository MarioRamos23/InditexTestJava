package com.inditex.domain.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "prices")
@Getter
@Setter
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
