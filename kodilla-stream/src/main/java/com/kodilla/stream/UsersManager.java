package com.kodilla.stream;
import java.util.List;
import java.util.stream.Collectors;
public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUserName();
    }
    public static List<User> filterUsersOlderThanAge(int age) {
        return UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
    public static List<User> filterUsersWithLessThan150Posts() {
        List<User> prolificUsers = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() < 150)
                .collect(Collectors.toList());
        return prolificUsers;
    }
}
