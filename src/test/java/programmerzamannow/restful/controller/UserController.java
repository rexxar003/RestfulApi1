package programmerzamannow.restful.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import programmerzamannow.model.RegisterUserRequest;
import programmerzamannow.model.WebResponse;
import programmerzamannow.repository.UserRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class UserController {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp(){
        userRepository.deleteAll();
    }

    @Test
    void testRegisterSucces() throws Exception{
        RegisterUserRequest request = new RegisterUserRequest();
        request.setUsername("test");
        request.setPassword("rahasia");
        request.setName("Test");

        mockMvc.perform(
            MockMvcRequestBuilders.get("/api/users")
            .accept(org.springframework.http.MediaType.APPLICATION_JSON)
            .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(request))
            ).andExpectAll(status().isOk())
            .andDo(
                result ->{
                    WebResponse<String> response = objectMapper.readValue(
                        result.getResponse().getContentAsString(),new TypeReference<WebResponse<String>>() {
                        }
                    );

                    Assertions.assertEquals("OK", response.getData());
                });
    }
}

