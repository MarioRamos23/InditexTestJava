package com.capitole.test.controller.response;

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

  private ZonedDateTime date;
  private Long brandId;
  private Long productId;
  private Long priceList;
  private BigDecimal price;

}
