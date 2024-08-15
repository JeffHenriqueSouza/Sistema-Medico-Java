package jg_user_management.service;

import jakarta.transaction.Transactional;
import jg_user_management.config.JwtUtil;
import jg_user_management.dto.request.InsertUserRequest;
import jg_user_management.dto.response.InsertUserResponse;
import jg_user_management.entity.UserEntity;
import jg_user_management.mapper.UserMapper;
import jg_user_management.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private JwtUtil jwtUtil;

    @SneakyThrows
    public InsertUserResponse insertUser(InsertUserRequest request) {
        UserEntity doctor = new UserEntity(request);
        UserEntity savedDoctor = repository.save(doctor);
        if (savedDoctor == null) {
            throw new RuntimeException("Falha ao salvar o Doctor no banco de dados.");
        }
        String token = jwtUtil.generateToken(savedDoctor.getEmail());
        InsertUserResponse response = UserMapper.INSTANCE.toInsertDoctorResponse(savedDoctor);
        response.setToken(token);
        response.setToken(token);
        return UserMapper.INSTANCE.toInsertDoctorResponse(savedDoctor);
    }
}
