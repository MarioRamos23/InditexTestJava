package com.capitole.test.usecase;

import com.capitole.test.controller.request.GetPricesRequest;
import com.capitole.test.controller.response.GetPricesResponse;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetPricesUseCaseImpl implements GetPricesUseCase{

  @Override
  public Optional<GetPricesResponse> getPrices(GetPricesRequest params) {
    return Optional.empty();
  }
}
