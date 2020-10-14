import com.jayway.jsonpath.JsonPath;
import org.hbs.model.Guest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
                        .content(String.valueOf(new Guest("Henning", "Georgi", "Am Wasenfeld 24"))))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\n" +
                        "    \"firstname\": \"Henning\",\n" +
                        "    \"lastname\": Georgi,\n" +
                        "    \"adress\": Am Wasenfeld 24\n" +
                        "}")).andReturn();

        String id = JsonPath.read(result.getResponse().getContentAsString(), "$.id");

        mockMvc.perform(
                get("/greeting/{id}", id))
                .andExpect(content().json("{\n" +
                        "    \"firstname\": \"Henning\",\n" +
                        "    \"lastname\": Georgi,\n" +
                        "    \"adress\": Am Wasenfeld 24\n" +
                        "}"));
    }

    @Test
    public void getBookingInvalid() throws Exception {

    }

    @Test
    public void createBooking() throws Exception {

    }

    @Test
    public void createBookingInvalid() throws Exception {

    }

    @Test
    public void testdelete() throws Exception {

    }

    @Test
    public void deleteInvalid() throws Exception {

    }
}
