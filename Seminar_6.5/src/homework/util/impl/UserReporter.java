package homework.util.impl;

import homework.User;
import homework.util.Reportable;

public class UserReporter implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
