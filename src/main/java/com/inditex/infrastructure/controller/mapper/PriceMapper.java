package com.inditex.infrastructure.controller.mapper;

import com.inditex.infrastructure.controller.response.GetPriceResponse;
import com.inditex.domain.model.PriceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

  GetPriceResponse priceEntityToGetPriceResponse(PriceEntity source);

}
