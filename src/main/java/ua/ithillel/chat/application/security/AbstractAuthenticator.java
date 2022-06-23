package ua.ithillel.chat.application.security;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
abstract class AbstractAuthenticator implements Authenticator {
    UserDetailsService userDetailsService;
}
