package com.mocktest.mocktest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.mocktest.mocktest.repository.UserRepository;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringtApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	UserRepository userRepository;

	@Test
	public void contextLoads() throws Exception {

		when(userRepository.findAll()).thenReturn(Collections.emptyList());

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/all/").accept(MediaType.APPLICATION_JSON))
				.andReturn();

		System.out.println(mvcResult.getResponse());

		verify(userRepository).findAll();
	}

}
