package kodlama.io.coffeshop.api.controller;

import kodlama.io.coffeshop.business.abstracts.CustomerService;
import kodlama.io.coffeshop.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.coffeshop.business.dto.request.update.UpdateCustomerRequest;
import kodlama.io.coffeshop.business.dto.response.create.CreateCustomerResponse;
import kodlama.io.coffeshop.business.dto.response.get.GetAllCustomersResponse;
import kodlama.io.coffeshop.business.dto.response.get.GetCustomerResponse;
import kodlama.io.coffeshop.business.dto.response.update.UpdateCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @GetMapping
    List<GetAllCustomersResponse> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    GetCustomerResponse getById(@PathVariable int id){
        return service.getById(id);
    }
    @PostMapping
    CreateCustomerResponse add(@RequestBody CreateCustomerRequest request){
        return service.add(request);
    }
    @PutMapping("/{id}")
    UpdateCustomerResponse update(@PathVariable int id, @RequestBody UpdateCustomerRequest request){
        return service.update(id,request);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable int id){
        service.delete(id);
    }

}
