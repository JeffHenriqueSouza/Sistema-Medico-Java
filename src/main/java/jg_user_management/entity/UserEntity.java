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

@Table(name = "0tb_doctors")
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
    private String crm;
    private String token;


    public UserEntity(InsertUserRequest request) {
        this.name = request.name();
        this.email = request.email();
        this.phoneNumber = request.phoneNumber();
        this.password = request.password();
        this.crm = request.crm();
    }

    public String getEmail() {
        return email;
    }
}
