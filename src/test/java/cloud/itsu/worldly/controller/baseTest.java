package cloud.itsu.worldly.controller;

import cloud.itsu.worldly.WorldlyApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {WorldlyApplication.class})
abstract class baseTest {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    String getBaseUrl() {
        return "http://localhost:" + port;
    }

}
