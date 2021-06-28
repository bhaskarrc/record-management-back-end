package com.boppo.recordManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordModel, Integer> {
	
	public RecordModel findByAadharNumber(String aadharNumber);

	public RecordModel findByMobileNumber(String mobileNumber);
	
	public RecordModel findByAadharNumberOrMobileNumber(String aadharNumber, String mobileNumber);
}
