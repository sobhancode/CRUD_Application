package in.sp.backend.CRUD_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.backend.CRUD_Project.entity.Customer;
import in.sp.backend.CRUD_Project.service.CustomerService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CustomerController {

	


	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public Customer postCustomer(@RequestBody Customer  customer) {
		return service.postCustomer(customer);
	}
}
