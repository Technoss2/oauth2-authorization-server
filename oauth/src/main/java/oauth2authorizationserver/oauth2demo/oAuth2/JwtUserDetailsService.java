package oauth2authorizationserver.oauth2demo.oAuth2;

import oauth2authorizationserver.oauth2demo.domain.Customer;
import oauth2authorizationserver.oauth2demo.dto.UserDTO;
import oauth2authorizationserver.oauth2demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerRepository.findByEmail(username);
        if(customer == null){
            throw new UsernameNotFoundException("User not found with username: " + username);
        } else {
            return new org.springframework.security.core.userdetails.User(customer.getEmail(), customer.getPasswordHash(),
                    new ArrayList<>());
        }
    }

    public Customer updateUserToken(UserDTO user) throws SQLException {
        Customer customer = new Customer(user);
        return customerRepository.save(customer);
    }
}
