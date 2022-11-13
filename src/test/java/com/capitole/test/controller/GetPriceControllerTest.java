package com.capitole.test.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.capitole.test.usecase.GetPricesUseCase;
import java.io.File;
import java.nio.file.Files;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class GetPriceControllerTest {

  @Mock
  private GetPricesUseCase useCase;

  private MockMvc mockMvc;

  @BeforeEach
  public void setUp() {
    mockMvc =
        MockMvcBuilders.standaloneSetup(new GetPriceController(useCase))
            .build();
  }

  @Test
  void test1() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test1.json").getFile();
    final String requestTest1 = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
            .contentType(APPLICATION_JSON)
            .content(requestTest1))
        .andDo(print())
        .andExpect(status().is2xxSuccessful());
  }

}
