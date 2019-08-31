package tws.controller;


import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tws.entity.Employee;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    //post
    @Test
    public void should_return_200_status_when_add_user()  throws Exception {
        Employee employee = new Employee("6");
        ObjectMapper objectMapper = new ObjectMapper();
        String example= objectMapper.writeValueAsString(employee);
        mockMvc.perform(MockMvcRequestBuilders.post("/employees")
                .contentType(MediaType.APPLICATION_JSON_UTF8).content(example))
                .andDo(print())
                .andExpect(status().isCreated());

    }
    //get
    @Test
    public void should_return_list_when_query() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employees"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
    //getpackinglotEmployee
    @Test
    public void should_return_packinglotEmployee_list_when_query() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employees/packinglot"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }



}
