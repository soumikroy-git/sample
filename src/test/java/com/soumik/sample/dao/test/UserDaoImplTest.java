package com.soumik.sample.dao.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.soumik.sample.dao.UserDaoImpl;

/**
 * User: samirmes
 * Date: 12/9/13
 * Time: 3:34 PM
 */
public class UserDaoImplTest {

    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    public void shouldReturnEmptyUserNameList() {
        List<String> userNameList = userDao.show();
        assertNotNull(userNameList);
        assertTrue(userNameList.size() == 1);
    }

    @Test
    public void shouldReturnPopulatedUserNameList() {
        String result = userDao.add("test");
        List<String> userNameList = userDao.show();
        assertNotNull(userNameList);
        assertTrue(userNameList.size() == 1);
    }

}