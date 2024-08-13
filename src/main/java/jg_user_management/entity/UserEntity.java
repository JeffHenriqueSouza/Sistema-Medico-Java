package jg_user_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jg_user_management.dto.request.InsertUserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "tb_user")
@Entity
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public UserEntity(InsertUserRequest request) {
        this.name = request.name();
        this.email = request.email();
        this.phoneNumber = request.phoneNumber();
        this.password = request.password();
    }
}
