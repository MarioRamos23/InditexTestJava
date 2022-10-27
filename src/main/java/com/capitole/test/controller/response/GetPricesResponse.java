package com.capitole.test.controller.response;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class GetPricesResponse {

  private Date date;
  private Long brandId;
  private Long productId;
  private Long priceList;
  private BigDecimal price;

}
