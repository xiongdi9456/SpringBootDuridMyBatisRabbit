package com.morningtec.sheldonrabbit.mapper.base;

import java.util.List;

import com.morningtec.sheldonrabbit.entity.User;
/**
*  @author sheldon
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}