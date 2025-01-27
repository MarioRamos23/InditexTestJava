package com.inditex.infrastructure.controller.response;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record GetPriceResponse (

  Long brandId,
  Long productId,
  Long priceList,
  ZonedDateTime startDate,
  ZonedDateTime endDate,
  BigDecimal price

){}
