package com.inditex.application.usecase;

import com.inditex.infrastructure.controller.request.GetPricesRequest;
import com.inditex.infrastructure.controller.response.GetPriceResponse;
import java.util.Optional;

public interface GetPricesUseCase {

  Optional<GetPriceResponse> getPrices(GetPricesRequest params);

}
