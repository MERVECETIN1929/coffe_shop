package kodlama.io.coffeshop.adapters;

import kodlama.io.coffeshop.business.abstracts.CheckCustomerValid;
import kodlama.io.coffeshop.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.coffeshop.common.CheckCustomerRequest;
import kodlama.io.coffeshop.entities.Customer;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeEDevletCheckManager implements CheckCustomerValid {
    List<CheckCustomerRequest> customers=new ArrayList<>();
    public FakeEDevletCheckManager(){
        customers.add(new CheckCustomerRequest("Merve","Çetin",2001,"12345678912"));
        customers.add(new CheckCustomerRequest("Elif","Gurbet",1985,"12345678912"));
        customers.add(new CheckCustomerRequest("Kader","Yıldız",2003,"12345678912"));
        customers.add(new CheckCustomerRequest("Arzu","Çetin",1984,"12345678912"));
        customers.add(new CheckCustomerRequest("Özge","Gül",2001,"12345678912"));
    }
    @Override
    public void checkCustomerIsValid(CheckCustomerRequest request) {
        for (CheckCustomerRequest customer : customers) {
            if(request.getFirstName().equals(customer.getFirstName())&&
            request.getLastName().equals(customer.getLastName())&&
            request.getTcNo().equals(customer.getTcNo())&&
            request.getBirthYears()==customer.getBirthYears()){
                return;
            }
        }
        throw new RuntimeException("Böyle bir kişi bulunamadı");
    }
}
