package io.hanmomhanda.wubwur.web;

import io.hanmomhanda.wubwur.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
/**
 * Created by hanmomhanda on 15. 8. 6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserControllerTest {

    private MockMvc mvc;

    @Autowired
    WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void signUp() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/signUp").accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(model().attribute("id", "hanmomhanda"))
                .andExpect(model().attribute("firstName", "Myung Woon"))
                .andExpect(model().attribute("lastName", "Oh"))
                ;
    }
}
