package cloud.itsu.worldly.repo;

import cloud.itsu.worldly.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {

}
