package com.kodilla.stream;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gala Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

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
            assert(user.getAge() > 40);
        }
    }
    @Test
    public void testFilterUsersOlderThanAgeWithEmptyList() {
        List<User> filteredUsers = UsersManager.filterUsersOlderThanAge(100);
        assert(filteredUsers.isEmpty());
    }
    @Test
    public void testFilterUsersWithLessThan150Posts() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Walter White", 50, 7, "Chemists"));
        userList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        userList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        userList.add(new User("Gus Firing", 49, 0, "Board"));
        userList.add(new User("Gala Boetticher", 44, 2, "Chemists"));
        userList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        List<User> prolificUsers = UsersManager.filterUsersWithLessThan150Posts();

        assertEquals(5, prolificUsers.size());

    }
}