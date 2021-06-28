package com.boppo.recordManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@RequestMapping("/records")
@CrossOrigin
public class RecordController {

	@Autowired
	private RecordService recordService;

	@GetMapping("/")
	public List<RecordModel> getAllRecords() {
		return recordService.getAllRecords();
	}

	@PostMapping("/")
	public RecordModel addRecord(@RequestBody RecordModel recordModel) {
		return recordService.addRecord(recordModel);
	}

	@DeleteMapping("/{id}")
	public String deleteRecord(@PathVariable("id") Integer id) {
		recordService.deleteRecord(id);
		return "Records Deleted";
	}
}
