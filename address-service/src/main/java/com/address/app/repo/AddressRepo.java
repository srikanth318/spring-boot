package com.address.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.address.app.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{
	
	// address based on a employee id
	
	@Query(nativeQuery = true, value = "select a.id,a.lane1,a.lane2,a.state,a.zip from address a join employee e on e.id=a.employee_id where a.employee_id=:employeeId")
	public Address findAddressByEmployeeId(@Param("employeeId") int employeeId );

}
