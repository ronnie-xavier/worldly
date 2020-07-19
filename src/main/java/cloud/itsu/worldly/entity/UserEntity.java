package cloud.itsu.worldly.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
