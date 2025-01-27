package com.inditex.infrastructure.controller.request;


import jakarta.validation.constraints.NotNull;

public record GetPricesRequest (
  @NotNull
  String date,
  @NotNull
  Long brandId,
  @NotNull
  Long productId
){}
