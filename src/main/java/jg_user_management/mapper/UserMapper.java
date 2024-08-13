package jg_user_management.mapper;

import jg_user_management.dto.response.InsertUserResponse;
import jg_user_management.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    InsertUserResponse toInsertDoctorResponse(UserEntity entity);
}
