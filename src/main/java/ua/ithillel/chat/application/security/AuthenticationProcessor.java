package ua.ithillel.chat.application.security;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthenticationProcessor {

    private static final Logger log = LogManager.getLogger(AuthenticationProcessor.class);

    AuthenticationManager authenticationManager;

    @SneakyThrows
    public AuthenticationContext process(Socket socket) {
        while (true) {
            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            log.info("Full authentication is needed.");

            String message = din.readUTF();
            // -login -u=<username> -p=<password>
            // PID, CLI shutdown
            if (message.startsWith("-login")) {
                log.info("Attempt for authentication: {}", socket);

                String[] credentials = CredentialUtils.parse(message);
                authenticationManager.doFilter(socket, new AuthenticationRequest(credentials[0], credentials[1], UserRole.valueOf(credentials[2])));

                AuthenticationContext authCtx = null;
                log.info("Attempt authentication succeeded: username={}", AuthenticationContext.getUser());

                return authCtx;
            } else {
                log.warn("Attempt authentication has no credential line: {}", socket);
                dout.writeUTF("Please send a valid credentials.");
            }
        }
    }
}
