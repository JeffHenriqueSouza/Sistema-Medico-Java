package jg_user_management.dto.response;

import lombok.Data;
import java.util.UUID;

@Data
public class InsertUserResponse {
    private UUID id;
    private String name;
    private String email;
    private String phoneNumber;
}

