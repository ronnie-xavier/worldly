package cloud.itsu.worldly.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Getter
@Builder
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
