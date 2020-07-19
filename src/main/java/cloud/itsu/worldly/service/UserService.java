package cloud.itsu.worldly.service;

import cloud.itsu.worldly.domain.User;
import cloud.itsu.worldly.entity.UserEntity;
import cloud.itsu.worldly.repo.UserRepo;
import cloud.itsu.worldly.exception.UserNotFoundException;
import cloud.itsu.worldly.transform.UserTransform;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUser(Long id) {
        UserEntity userEntity = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return UserTransform.transform(userEntity);
    }
}
