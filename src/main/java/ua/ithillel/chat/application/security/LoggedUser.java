package ua.ithillel.chat.application.security;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode
public class LoggedUser {
    String username;
    String password;
    UserRole userRole;
}
