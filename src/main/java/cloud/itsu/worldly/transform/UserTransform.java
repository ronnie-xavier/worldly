package cloud.itsu.worldly.transform;

import cloud.itsu.worldly.domain.User;
import cloud.itsu.worldly.entity.UserEntity;

public class UserTransform {

    public static User transform (UserEntity userEntity) {
        return User.builder().id(userEntity.getId()).name(userEntity.getName()).build();
    }
}
