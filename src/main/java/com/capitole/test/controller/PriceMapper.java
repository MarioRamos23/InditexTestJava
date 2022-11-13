package com.capitole.test.controller;

import com.capitole.test.controller.response.GetPriceResponse;
import com.capitole.test.repository.model.Price;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

  GetPriceResponse priceEntityToGetPricedResponse(Price source);

}
