package com.capitole.test.usecase;

import com.capitole.test.controller.request.GetPricesRequest;
import com.capitole.test.controller.response.GetPriceResponse;
import java.util.Optional;

public interface GetPricesUseCase {

  Optional<GetPriceResponse> getPrices(GetPricesRequest params);

}
