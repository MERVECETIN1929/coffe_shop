package kodlama.io.coffeshop.business.dto.request.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UpdateCustomerRequest {

    private String firstName;
    private String lastName;
    private int birthYears;
    private String tcNo;
    private String eMail;
    private String password;
}
