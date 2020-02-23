package com.mycompany;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.calcapp.CalculatorApplication;
import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.persist.MyRepository;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculatorApplication.class)
@AutoConfigureMockMvc
class LmsUseCaseApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private MyRepository repository;

	// This object will be magically initialized by the initFields method below.
	private JacksonTester<MathOperation> jsonOperation;

	@BeforeEach
	public void setup() {
		// Initializes the JacksonTester
		JacksonTester.initFields(this, new ObjectMapper());
	}

	@Test
	public void testAdd() throws Exception {
		// when
		MockHttpServletResponse response = mvc.perform(
				post("/Addition/").contentType(MediaType.APPLICATION_JSON).content(
						jsonOperation.write(new MathOperation(3.5,45.8)).getJson()
						)).andReturn().getResponse();
		// then
		assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
		assertThat(response.getContentAsString()).isEqualTo(
				"{\"id\":null,\"number1\":3.5,\"number2\":45.8,\"result\":49.3,\"operation\":\"+\"}"
				);
	}
	
	@Test
	public void testSubtract() throws Exception {
		// when
		MockHttpServletResponse response = mvc.perform(
				post("/Subtraction/").contentType(MediaType.APPLICATION_JSON).content(
						jsonOperation.write(new MathOperation(3.5,45)).getJson()
						)).andReturn().getResponse();
		
		// then
		assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
		assertThat(response.getContentAsString()).isEqualTo(
                "{\"id\":null,\"number1\":3.5,\"number2\":45.0,\"result\":-41.5,\"operation\":\"-\"}"
        );
	}
	
	@Test
	public void testViewDataBase() throws Exception {
		 // when
    	when(repository.findAll()).thenReturn(Stream.
				of(new MathOperation(2.0,3.0), new MathOperation(6.0,2.0), new MathOperation(11.0,43.0)).collect(Collectors.toList()));
	//assertEquals(1, services.viewDatabase().size());
	

		// when
    	MockHttpServletResponse response = mvc.perform(
                get("/Operations/")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

    	 // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       
	}



}
