package kodlama.io.coffeshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user")
    private List<Customer> customers;
}
