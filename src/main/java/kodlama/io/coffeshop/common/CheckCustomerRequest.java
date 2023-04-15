package kodlama.io.coffeshop.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckCustomerRequest {
    private String firstName;
    private String lastName;
    private int birthYears;
    private String tcNo;
}
