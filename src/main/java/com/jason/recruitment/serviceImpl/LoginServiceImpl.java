package com.jason.recruitment.serviceImpl;

import com.jason.recruitment.dao.UserAdminDao;
import com.jason.recruitment.domain.UserAdmin;
import com.jason.recruitment.services.LoginService;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Jason on 17/09/2017.
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserAdminDao userAdminDao;

    @Override
    public UserAdmin getUserAdmin(Integer id) {
        LogFactory.useLog4JLogging();
        return userAdminDao.selectByPrimaryKey(id);
    }
}
