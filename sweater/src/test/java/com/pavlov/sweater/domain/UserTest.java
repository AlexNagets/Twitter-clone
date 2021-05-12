package com.pavlov.sweater.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

class UserTest {
    @Test
    void test() {
        User usr = new User();
        String str = "asdf";
        usr.setUsername(str);
        usr.setPassword(str);
        assertEquals(str, usr.getUsername());
        assertEquals(str, usr.getPassword());

        Set<Role> roles = new HashSet<>();
        roles.add(Role.ADMIN);
        usr.setRoles(roles);
        assertEquals(roles, usr.getRoles());
    }
}