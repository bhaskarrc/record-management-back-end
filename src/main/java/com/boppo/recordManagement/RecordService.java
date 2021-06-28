package com.boppo.recordManagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;

	public RecordModel addRecord(RecordModel model) {
		RecordModel savedRecord = recordRepository.save(model);
		return savedRecord;
	}

	public void deleteRecord(Integer id) {
		recordRepository.deleteById(id);
	}

	public List<RecordModel> getAllRecords() {
		List<RecordModel> records = new ArrayList<>();
		recordRepository.findAll().forEach(records::add);
		return records;
	}
}
