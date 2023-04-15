package kodlama.io.coffeshop.business.dto.response.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetCustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private int birthYears;
    private String tcNo;
    private String eMail;
    private String password;

}
