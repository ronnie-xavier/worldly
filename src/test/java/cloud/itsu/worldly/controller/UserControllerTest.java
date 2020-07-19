package cloud.itsu.worldly.controller;

import cloud.itsu.worldly.domain.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:scripts/UserTestSetup.sql")
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:scripts/DataCleanup.sql")
class UserControllerTest extends AbstractBaseTest {

    private static final Long ID = 1L;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void get_whenTypical() throws Exception{
        ResponseEntity<User> response = testRestTemplate.exchange(
                new URL(getBaseUrl() + "/user/" + ID).toString(),
                HttpMethod.GET,
                null,
                User.class
        );

        User user = response.getBody();

        assertThat(user.getId(), equalTo(ID));
    }
}