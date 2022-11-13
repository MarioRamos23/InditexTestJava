package com.capitole.test.usecase;

import com.capitole.test.controller.PriceMapper;
import com.capitole.test.controller.request.GetPricesRequest;
import com.capitole.test.controller.response.GetPriceResponse;
import com.capitole.test.repository.PriceRepository;
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
    return Optional.of(mapper.priceEntityToGetPricedResponse(
        priceRepository.findByFilterParams(params.getDate(), params.getBrandId(),
            params.getProductId())));
  }
}
