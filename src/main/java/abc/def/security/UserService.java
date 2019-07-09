package abc.def.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveNewUser(String username, String password) {
        return userRepository.save(User.builder().username(username).password(new BCryptPasswordEncoder(11).encode(password)).build());
    }
}
