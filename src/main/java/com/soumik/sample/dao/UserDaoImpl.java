package com.soumik.sample.dao;

import java.util.List;

/**
 * User: samirmes
 * Date: 12/9/13
 * Time: 3:23 PM
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<String> show() {
        return UserCache.userNameList;
    }

    @Override
    public String add(String username) {
        UserCache.userNameList.add(username);

        return "user:::::  " + username+ "  added successfully" ;
    }
}