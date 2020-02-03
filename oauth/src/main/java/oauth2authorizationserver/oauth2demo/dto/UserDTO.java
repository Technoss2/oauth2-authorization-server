package oauth2authorizationserver.oauth2demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class UserDTO {
    private Integer id;
    private String email;
    private String passwordHash;
    private String token;
}
