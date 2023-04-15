package kodlama.io.coffeshop.business.concretes;

import kodlama.io.coffeshop.business.abstracts.CheckCustomerValid;
import kodlama.io.coffeshop.business.abstracts.CustomerService;
import kodlama.io.coffeshop.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.coffeshop.business.dto.request.update.UpdateCustomerRequest;
import kodlama.io.coffeshop.business.dto.response.create.CreateCustomerResponse;
import kodlama.io.coffeshop.business.dto.response.get.GetAllCustomersResponse;
import kodlama.io.coffeshop.business.dto.response.get.GetCustomerResponse;
import kodlama.io.coffeshop.business.dto.response.update.UpdateCustomerResponse;
import kodlama.io.coffeshop.common.CheckCustomerRequest;
import kodlama.io.coffeshop.entities.Customer;
import kodlama.io.coffeshop.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;
    private final CheckCustomerValid checkCustomerValid;
    @Override
    public List<GetAllCustomersResponse> getAll() {
        List<Customer> customers=repository.findAll();
        List<GetAllCustomersResponse> getAllCustomersResponses=customers.stream()
                .map(customer -> mapper.map(customer,GetAllCustomersResponse.class)).toList();
        return getAllCustomersResponses;
    }

    @Override
    public GetCustomerResponse getById(int id) {
        Customer customer=repository.findById(id).orElseThrow();
        GetCustomerResponse getCustomerResponse=mapper.map(customer,GetCustomerResponse.class);
        return getCustomerResponse;
    }

    @Override
    public CreateCustomerResponse add(CreateCustomerRequest request) {
        // ekleme işleminde kişi varlığı kontrol edilmeli
        checkCustomerValid.checkCustomerIsValid(mapper.map(request, CheckCustomerRequest.class));
        Customer customer=mapper.map(request,Customer.class);
        customer.setId(0);
        repository.save(customer);
        CreateCustomerResponse createCustomerResponse=mapper.map(customer,CreateCustomerResponse.class);
        return createCustomerResponse;
    }

    @Override
    public UpdateCustomerResponse update(int id, UpdateCustomerRequest request) {
        checkCustomerValid.checkCustomerIsValid(mapper.map(request, CheckCustomerRequest.class));
        Customer customer=mapper.map(request,Customer.class);
        customer.setId(id);
        repository.save(customer);
        UpdateCustomerResponse updateCustomerResponse=mapper.map(customer,UpdateCustomerResponse.class);
        return updateCustomerResponse;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
