package com.jason.recruitment.services;

import com.jason.recruitment.dao.UserAdminDao;
import com.jason.recruitment.domain.UserAdmin;
import org.springframework.stereotype.Service;

/**
 * Created by Jason on 17/09/2017.
 */

public interface LoginService {

    UserAdmin getUserAdmin (Integer id);

}
