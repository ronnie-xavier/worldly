package cloud.itsu.worldly.service;

import cloud.itsu.worldly.domain.User;
import cloud.itsu.worldly.entity.UserEntity;
import cloud.itsu.worldly.exception.UserNotFoundException;
import cloud.itsu.worldly.repo.UserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private static final long ID = 1L;
    private static final String NAME = "test";

    @InjectMocks
    UserService testObject;

    @Mock
    UserRepo userRepo;

    @Test
    public void getUser_whenTypical() {
        when(userRepo.findById(1L)).thenReturn(getSampleOptionalUserEntity());

        User user = testObject.getUser(1L);
        assertThat(user.getId(), equalTo(ID));
        assertThat(user.getName(), equalTo(NAME));
    }

    @Test
    public void getUser_whenIdNotFound() {
        when(userRepo.findById(1L)).thenReturn(Optional.empty());

        Assertions.assertThrows(UserNotFoundException.class, () -> testObject.getUser(1L));
    }

    private Optional<UserEntity> getSampleOptionalUserEntity() {
        return Optional.of(UserEntity.builder().id(ID).name(NAME).build());
    }

}