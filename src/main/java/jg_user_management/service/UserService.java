package jg_user_management.service;

import jakarta.transaction.Transactional;
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

    @SneakyThrows
    public InsertUserResponse insertUser(InsertUserRequest request) {
        UserEntity doctor = new UserEntity(request);
        UserEntity savedDoctor = repository.save(doctor);
        return UserMapper.INSTANCE.toInsertDoctorResponse(savedDoctor);
    }
}
