package kodlama.io.coffeshop.business.abstracts;

import kodlama.io.coffeshop.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.coffeshop.common.CheckCustomerRequest;

public interface CheckCustomerValid {
    void checkCustomerIsValid(CheckCustomerRequest request);
}
