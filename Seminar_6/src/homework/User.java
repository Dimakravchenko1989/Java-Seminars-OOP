package homework;

import homework.util.Reportable;
import homework.util.impl.UserReporter;

public class User {
    private final String name;
    private final Reportable<User> reporter;

    public User(String name, Reportable<User> reporter){
        this.name = name;
        this.reporter = reporter;
    }

    public User(String name) {
        this(name, new UserReporter());
    }

    public String getName(){
        return name;
    }

    public void report(){
        reporter.report(this);
    }
}
