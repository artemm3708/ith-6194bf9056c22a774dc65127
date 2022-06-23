package ua.ithillel.chat.application.security;

/**
 * Really existing user in the source and authenticated.
 */
public record UserDetails(String username, String password, UserRole userRole) {
}
