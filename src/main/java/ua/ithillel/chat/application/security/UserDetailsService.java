package ua.ithillel.chat.application.security;

public interface UserDetailsService {
    /**
     * @param username
     * @return existing user in the source
     * @throws AuthenticationException when no user found
     */
    UserDetails findByUsername(String username) throws AuthenticationException;
}
