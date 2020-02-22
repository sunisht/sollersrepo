package com.mycompany;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.calcapp.controller.CalController;
import com.mycompany.calcapp.controller.MyFilter;
import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.exception.CustomError;
import com.mycompany.calcapp.persist.MyRepository;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@RunWith(MockitoJUnitRunner.class)
public class MyTest {

	private MockMvc mvc;

	@Mock
	private MyRepository repository;

	@InjectMocks
	private CalController calController;


	private JacksonTester<MathOperation> jsonTester;
	
	 @Autowired
	 private TestRestTemplate restTemplate;


	@Before
	public void setup() {
		// We would need this line if we would not use MockitoJUnitRunner
		// MockitoAnnotations.initMocks(this);
		// Initializes the JacksonTester
		JacksonTester.initFields(this, new ObjectMapper());
		// MockMvc standalone approach
		mvc = MockMvcBuilders.standaloneSetup(calController)
				.setControllerAdvice(new CustomError())
				.addFilters(new MyFilter())
				.build();
	}

	@Test
	public void canSubtract() throws Exception {
		// when
		MockHttpServletResponse response = mvc.perform(
				post("/Subtraction/").contentType(MediaType.APPLICATION_JSON).content(
						jsonTester.write(new MathOperation(2.0, 12.0)).getJson()
						)).andReturn().getResponse();

		// then
		assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
	}

	@Test
	public void canAdd1() throws Exception {
		// when
		MockHttpServletResponse response = mvc.perform(
				post("/Addition/").contentType(MediaType.APPLICATION_JSON).content(
						jsonTester.write(new MathOperation(2.0, 12.0)).getJson()
						)).andReturn().getResponse();

		// then
		assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
	}
	
	  @Test
	    public void canAddInDatabase() {
	        // when
	        ResponseEntity<MathOperation> superHeroResponse = restTemplate.postForEntity("/Addition/",
	                new MathOperation(20,10), MathOperation.class);

	        // then
	        assertThat(superHeroResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
	    }

}
