package mk.com.iwec.FurnitureApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mk.com.iwec.FurnitureApp.dto.FurnituresDto;
import mk.com.iwec.FurnitureApp.mapper.ModelMapper;
import mk.com.iwec.FurnitureApp.models.Chair;
import mk.com.iwec.FurnitureApp.models.Cupboard;
import mk.com.iwec.FurnitureApp.models.Furnitures;
import mk.com.iwec.FurnitureApp.models.Table;

@Service
public class FurnitureService implements ServiceLayer<FurnituresDto> {

	@Autowired
	ModelMapper mapper;

	public String calculate(FurnituresDto furnituresDto) {
		Furnitures furnitures=mapper.mapFurnituresDto(furnituresDto);
		Integer cupboardTotal= furnitures.getFurnitures().stream()
				.filter(f -> f instanceof Cupboard).map(f-> f.calculateCost()).reduce(0, Integer::sum);
		Integer chairTotal= furnitures.getFurnitures().stream()
				.filter(f -> f instanceof Chair).map(f-> f.calculateCost()).reduce(0, Integer::sum);
		Integer tableTotal= furnitures.getFurnitures().stream()
				.filter(f -> f instanceof Table).map(f-> f.calculateCost()).reduce(0, Integer::sum);
		
				return mostExpensive(cupboardTotal,tableTotal,chairTotal);

	}
	
	public String mostExpensive(Integer cupboardSum, Integer tableSum, Integer chairSum) {
		if (cupboardSum >= tableSum && cupboardSum >= chairSum) {
			return "Cupboard Group is the most expensive furniture group.";
		} else if (cupboardSum <= tableSum && tableSum >= chairSum) {
			return "Table Group is the most expensice furniture group.";
		} else {
			return "Chair Group is the most expensive furniture group.";
		}
	}

}
