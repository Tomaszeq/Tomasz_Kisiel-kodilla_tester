package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double getAveragePostsForUsersAboveAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge()>= age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
    public static double getAveragePostsForUsersBelowAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double avgPostsAbove40 = ForumStats.getAveragePostsForUsersAboveAge(users, 40);
        double avgPostsBelow40 = ForumStats.getAveragePostsForUsersBelowAge(users, 40);
        System.out.println("Average posts for users above 40: " + avgPostsAbove40);
        System.out.println("Average posts for users below 40: " + avgPostsBelow40);
    }
}
