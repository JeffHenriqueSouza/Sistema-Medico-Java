package jg_user_management.mapper;

import javax.annotation.processing.Generated;
import jg_user_management.dto.response.InsertUserResponse;
import jg_user_management.entity.UserEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-14T22:08:37-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public InsertUserResponse toInsertDoctorResponse(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        InsertUserResponse insertUserResponse = new InsertUserResponse();

        insertUserResponse.setToken( entity.getToken() );
        insertUserResponse.setId( entity.getId() );
        insertUserResponse.setName( entity.getName() );
        insertUserResponse.setEmail( entity.getEmail() );
        insertUserResponse.setPhoneNumber( entity.getPhoneNumber() );
        insertUserResponse.setCrm( entity.getCrm() );

        return insertUserResponse;
    }
}
