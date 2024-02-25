package in.sp.backend.CRUD_Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.backend.CRUD_Project.entity.Customer;
import in.sp.backend.CRUD_Project.repo.CustomerRepository;

@Service
public class CustomerService {
	



	@Autowired
	private  CustomerRepository repository;
	
	public Customer postCustomer(Customer customer) {
		return repository.save(customer);
	}
}
