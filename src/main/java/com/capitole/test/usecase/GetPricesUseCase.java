package com.capitole.test.usecase;

import com.capitole.test.controller.request.GetPricesRequest;
import com.capitole.test.controller.response.GetPricesResponse;
import java.util.Optional;

public interface GetPricesUseCase {

  Optional<GetPricesResponse> getPrices(GetPricesRequest params);

}
