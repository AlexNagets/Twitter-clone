package com.pavlov.sweater.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    void test() {
        Role role = Role.USER;
        assertEquals("USER", role.getAuthority());

        role = Role.ADMIN;
        assertEquals("ADMIN", role.getAuthority());
    }
}