package com.inditex.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.io.File;
import java.nio.file.Files;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class GetPriceControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void test1() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test1.json").getFile();
    final String requestTest = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
                    .contentType(APPLICATION_JSON)
                    .content(requestTest))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.priceList").value("1"))
            .andExpect(jsonPath("$.price").value("35.5"));
  }

  @Test
  void test2() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test2.json").getFile();
    final String requestTest = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
                    .contentType(APPLICATION_JSON)
                    .content(requestTest))
            .andDo(print())
            .andExpect(status().is2xxSuccessful())
            .andExpect(jsonPath("$.priceList").value("2"))
            .andExpect(jsonPath("$.price").value("25.45"));
  }

  @Test
  void test3() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test3.json").getFile();
    final String requestTest = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
                    .contentType(APPLICATION_JSON)
                    .content(requestTest))
            .andDo(print())
            .andExpect(status().is2xxSuccessful())
            .andExpect(jsonPath("$.priceList").value("1"))
            .andExpect(jsonPath("$.price").value("35.5"));
  }

  @Test
  void test4() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test4.json").getFile();
    final String requestTest = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
                    .contentType(APPLICATION_JSON)
                    .content(requestTest))
            .andDo(print())
            .andExpect(status().is2xxSuccessful())
            .andExpect(jsonPath("$.priceList").value("3"))
            .andExpect(jsonPath("$.price").value("30.5"));
  }

  @Test
  void test5() throws Exception {

    final File jsonFile = new ClassPathResource("jsontest/test5.json").getFile();
    final String requestTest = Files.readString(jsonFile.toPath());

    this.mockMvc.perform(get("/prices")
                    .contentType(APPLICATION_JSON)
                    .content(requestTest))
            .andDo(print())
            .andExpect(status().is2xxSuccessful())
            .andExpect(jsonPath("$.priceList").value("4"))
            .andExpect(jsonPath("$.price").value("38.95"));
  }

}
