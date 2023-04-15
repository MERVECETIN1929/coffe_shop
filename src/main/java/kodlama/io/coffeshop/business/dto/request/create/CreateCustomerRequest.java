package kodlama.io.coffeshop.business.dto.request.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCustomerRequest {

    private String firstName;
    private String lastName;
    private int birthYears;
    private String tcNo;
    private String eMail;
    private String password;
}
