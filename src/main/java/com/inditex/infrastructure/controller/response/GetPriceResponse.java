package com.inditex.infrastructure.controller.response;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetPriceResponse {

  private Long brandId;
  private Long productId;
  private Long priceList;
  private ZonedDateTime startDate;
  private ZonedDateTime endDate;
  private BigDecimal price;

}
