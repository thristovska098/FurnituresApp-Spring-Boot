package mk.com.iwec.FurnitureApp.mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import mk.com.iwec.FurnitureApp.dto.FurnitureDto;
import mk.com.iwec.FurnitureApp.dto.FurnituresDto;
import mk.com.iwec.FurnitureApp.models.Chair;
import mk.com.iwec.FurnitureApp.models.Cupboard;
import mk.com.iwec.FurnitureApp.models.Furniture;
import mk.com.iwec.FurnitureApp.models.Furnitures;
import mk.com.iwec.FurnitureApp.models.Table;

@Component
public class ModelMapper {

	public Furnitures mapFurnituresDto(FurnituresDto furnitures) {
		return new Furnitures(mapFurnitures(furnitures.getFurnitures()));
	}

	public List<Furniture> mapFurnitures(List<FurnitureDto> furnituresDto) {
		List<Furniture> furniture = furnituresDto.stream().map(f -> mapFurniture(f)).filter(f -> Objects.nonNull(f))
				.collect(Collectors.toList());
		return furniture;
	}

	public Furniture mapFurniture(FurnitureDto furniture) {
		if (furniture.getType() == "cupboard") {
			return mapCupboard(furniture);
		} else if (furniture.getType() == "chair") {
			return mapChair(furniture);
		} else
			return mapTable(furniture);

	}

	public Furniture mapCupboard(FurnitureDto furniture) {
		if (furniture.getPlastic() != null || furniture.getGlass() != null || furniture.getWood() == null) {
			return null;
		}
		Furniture newCup = new Cupboard(furniture.getWood());
		return newCup;
	}

	public Furniture mapChair(FurnitureDto furniture) {
		if (furniture.getPlastic() != null || furniture.getGlass() == null || furniture.getWood() == null) {
			return null;
		}
		Furniture newChair = new Chair(furniture.getWood(), furniture.getGlass());
		return newChair;
	}

	public Furniture mapTable(FurnitureDto furniture) {
		if (furniture.getPlastic() == null || furniture.getGlass() == null || furniture.getWood() == null) {
			return null;
		}
		Furniture newTable = new Table(furniture.getWood(), furniture.getGlass(), furniture.getPlastic());
		return newTable;
	}
}
