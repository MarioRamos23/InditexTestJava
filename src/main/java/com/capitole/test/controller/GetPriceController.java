package com.capitole.test.controller;

import com.capitole.test.controller.request.GetPricesRequest;
import com.capitole.test.controller.response.GetPricesResponse;
import com.capitole.test.usecase.GetPricesUseCase;
import java.util.Optional;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
@RequiredArgsConstructor
public class GetPriceController {

  private final GetPricesUseCase useCase;

  @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<GetPricesResponse> getPrices(
      @RequestBody @Valid GetPricesRequest params) {

    Optional<GetPricesResponse> result = useCase.getPrices(params);
    return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
  }

}
