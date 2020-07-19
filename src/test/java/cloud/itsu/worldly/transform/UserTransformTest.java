package cloud.itsu.worldly.transform;

import cloud.itsu.worldly.domain.User;
import cloud.itsu.worldly.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(MockitoExtension.class)
class UserTransformTest {

    private static final long ID = 1L;
    private static final String NAME = "test";

    @InjectMocks
    UserTransform testObject;

    @Test
    void transform_whenTypical() {
        UserEntity sampleUserEntity = getSampleUserEntity();

        User user = testObject.transform(sampleUserEntity);
        assertThat(user.getId(), equalTo(ID));
        assertThat(user.getName(), equalTo(NAME));

    }

    private UserEntity getSampleUserEntity() {
        return UserEntity.builder().id(ID).name(NAME).build();
    }
}