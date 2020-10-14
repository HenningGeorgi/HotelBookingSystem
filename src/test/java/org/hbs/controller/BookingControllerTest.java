package org.hbs.controller;

import com.jayway.jsonpath.JsonPath;
import org.hbs.model.Guest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class BookingControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void getBookings() throws Exception {

    }

    @Test
    public void getBookingsInvalid() throws Exception {

    }

    @Test
    public void getBooking() throws Exception {
        MvcResult result = mockMvc.perform(
                post("/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Henning\"}"))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\n" +
                        "    \"guest\": \"Henning\",\n" +
                        "}")).andReturn();

        String id = JsonPath.read(result.getResponse().getContentAsString(), "$.id");

        mockMvc.perform(
                get("/greeting/{id}", id))
                .andExpect(content().json("{\n" +
                        "    \"guest\": \"Henning\",\n" +
                        "}"));
    }

    @Test
    public void getBookingInvalid() throws Exception {
        mockMvc.perform(
                get("/booking/{id}", "0f81d478-6ece-4b59-8075-bd6a627d76fd"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void createBooking() throws Exception {
        mockMvc.perform(
                post("/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Henning\"}"))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\n" +
                        "    \"guest\": \"Henning\",\n" +
                        "}"));
    }

    @Test
    public void createBookingInvalid() throws Exception {
        mockMvc.perform(
                post("/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Henning\"}"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testdelete() throws Exception {
        MvcResult result = mockMvc.perform(
                post("/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Henning\"}"))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\n" +
                        "   \"name\":\"Henning\",\n" +
                        "}")).andReturn();

        String id = JsonPath.read(result.getResponse().getContentAsString(), "$.id");

        mockMvc.perform(
                delete("/booking/{id}", id))
                .andExpect(status().isOk());
    }

    @Test
    public void deleteInvalid() throws Exception {
        mockMvc.perform(
                delete("/booking/{id}", "0f81d478-6ece-4b59-8075-bd6a627d76fd"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testput() throws Exception {
        MvcResult result = mockMvc.perform(
                post("/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Henning\"}"))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\n" +
                        "   \"name\":\"Henning\",\n" +
                        "}")).andReturn();

        String id = JsonPath.read(result.getResponse().getContentAsString(), "$.id");

        mockMvc.perform(
                put("/booking/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Oliver\"}"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\n" +
                        "   \"guest\":\"Oliver\", \n + " +
                        "}"));
    }

    @Test
    public void putInvalid() throws Exception {
        mockMvc.perform(
                put("/booking/{id}", "0f81d478-6ece-4b59-8075-bd6a627d76fd")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"guest\":\"Henning\"}"))
                .andExpect(status().isNotFound());
    }
}
