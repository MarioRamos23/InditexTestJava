package com.inditex.application.usecase;

import com.inditex.domain.model.PriceEntity;
import com.inditex.infrastructure.controller.mapper.PriceMapper;
import com.inditex.infrastructure.controller.request.GetPricesRequest;
import com.inditex.infrastructure.controller.response.GetPriceResponse;
import com.inditex.domain.PriceRepository;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetPricesUseCaseImpl implements GetPricesUseCase {

  private final PriceRepository priceRepository;
  private final PriceMapper mapper;

  @Override
  public Optional<GetPriceResponse> getPrices(GetPricesRequest params) {

    DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    ZonedDateTime zonedDateTime = ZonedDateTime.parse(params.getDate(), formatter);

    PriceEntity response = priceRepository.findByFilterParams(zonedDateTime, params.getBrandId(),
            params.getProductId());
    return Optional.of(mapper.priceEntityToGetPriceResponse(response));
  }
}
