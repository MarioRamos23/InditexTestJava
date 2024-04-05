package com.inditex.infrastructure.controller.request;


import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class GetPricesRequest {

  @NotNull
  private String date;

  @NotNull
  private Long brandId;

  @NotNull
  private Long productId;

}
