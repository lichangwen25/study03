package org.exampledriven.eureka.customer.shared;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceFeignClientFallback implements CustomerServiceFeignClient {

    
    public Customer getCustomer(int id) {
        return new Customer(12, "Fallback", "Customer");
    }

	public Customer getCustomer2(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer list(ReqCustomer bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
