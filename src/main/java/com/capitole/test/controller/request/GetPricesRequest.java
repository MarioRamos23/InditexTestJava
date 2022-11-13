package com.capitole.test.controller.request;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class GetPricesRequest {

  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String date;

  @NotNull
  private Long brandId;

  @NotNull
  private Long productId;

}
