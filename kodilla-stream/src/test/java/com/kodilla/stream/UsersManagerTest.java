package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> usernames = UsersManager.filterChemistGroupUsernames();
        List<String> expectedUsernames = new ArrayList<>();
        expectedUsernames.add("Walter White");
        expectedUsernames.add("Gala Boetticher");

        assertEquals(expectedUsernames, usernames);
    }
    @Test
    public void testFilterUsersOlderThanAge() {
        List<User> filteredUsers = UsersManager.filterUsersOlderThanAge(40);
        for (User user : filteredUsers) {
            assertTrue(user.getAge() > 40);
        }
    }
    @Test
    public void testFilterUsersOlderThanAgeWithEmptyList() {
        List<User> filteredUsers = UsersManager.filterUsersOlderThanAge(100);
        assertTrue(filteredUsers.isEmpty());
    }
    @Test
    public void testFilterUsersWithLessThan150Posts() {
        List<User> prolificUsers = UsersManager.filterUsersWithLessThan150Posts();
        assertEquals(5, prolificUsers.size());
    }
}