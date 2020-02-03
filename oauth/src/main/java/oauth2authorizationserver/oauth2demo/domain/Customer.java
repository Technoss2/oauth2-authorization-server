package oauth2authorizationserver.oauth2demo.domain;

import lombok.*;
import oauth2authorizationserver.oauth2demo.dto.UserDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "Customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerID;

    @Column(name = "Title")
    private String title;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "ContactNumber")
    private String contactNumber;

    @Column(name = "Email")
    private String email;

    @Column(name = "PasswordHash", columnDefinition = "BINARY(64)", length = 16)
    private String passwordHash;

    @Column(name = "Balance")
    private BigDecimal balance;

    private String token;

    public Customer(UserDTO userDTO) {
        this.customerID = userDTO.getId();
        this.email = userDTO.getEmail();
        this.passwordHash = userDTO.getPasswordHash();
    }
}