package com.capitole.test.controller.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GetPricesRequest {

  @NotNull
  private Date date;

  @NotNull
  private Long brandId;

  @NotNull
  private Long productId;

}
