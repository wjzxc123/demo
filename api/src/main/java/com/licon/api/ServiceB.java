package com.licon.api;

import java.util.List;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:15
 */
public interface ServiceB {
    void testB();

    List<User> findUser(List<User> users);
}
