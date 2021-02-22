package mk.com.iwec.FurnitureApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mk.com.iwec.FurnitureApp.dto.FurnituresDto;
import mk.com.iwec.FurnitureApp.service.FurnitureService;

@RestController
public class FurnitureController implements Controller<FurnituresDto> {

	@Autowired
	FurnitureService service;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public String calculate(@RequestBody FurnituresDto items) {
		return service.calculate(items);
	}

}
