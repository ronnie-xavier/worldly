package cloud.itsu.worldly.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class newsTest extends baseTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void get_whenTypical() throws Exception{
        ResponseEntity<String> response = testRestTemplate.exchange(
                new URL(getBaseUrl() + "/news/home-page").toString(),
                HttpMethod.GET,
                null,
                String.class
        );
        assertThat(response.getBody(), equalTo("temp"));
    }
}