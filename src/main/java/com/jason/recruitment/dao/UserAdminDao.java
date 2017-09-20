package com.jason.recruitment.dao;

import com.jason.recruitment.domain.UserAdmin;
import org.springframework.stereotype.Repository;

/**
 * Created by Jason on 17/09/2017.
 */
@Repository
public interface UserAdminDao {
    UserAdmin selectByPrimaryKey(Integer id);
    void deleteByPrimaryKey(Integer id);
    void insert(UserAdmin userAdmin);
    void insertSelective(UserAdmin userAdmin);
    void updateByPrimaryKeySelective(UserAdmin userAdmin);
    void updateByPrimaryKey(UserAdmin userAdmin);
}
