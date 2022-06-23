package ua.ithillel.chat.application.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@EqualsAndHashCode
@ToString
public class User {
    Long id;
    String username;
    String password;
    String userRole;

    public User(Long id, String username, String password, String userRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public User(String username, String password, String userRole) {
        this(null, username, password, userRole);
    }
}
