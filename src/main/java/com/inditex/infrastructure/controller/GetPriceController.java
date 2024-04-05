package com.inditex.infrastructure.controller;

import com.inditex.infrastructure.controller.request.GetPricesRequest;
import com.inditex.infrastructure.controller.response.GetPriceResponse;
import com.inditex.application.usecase.GetPricesUseCase;
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
  public ResponseEntity<GetPriceResponse> getPrices(
      @RequestBody @Valid GetPricesRequest params) {

    Optional<GetPriceResponse> result = useCase.getPrices(params);
    return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
  }

}
