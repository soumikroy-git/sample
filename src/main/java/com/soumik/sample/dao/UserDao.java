package com.soumik.sample.dao;

import java.util.List;

/**
 * User: samirmes
 * Date: 12/9/13
 * Time: 3:23 PM
 */
public interface UserDao {
    List<String> show();
    String add(String username);
}
