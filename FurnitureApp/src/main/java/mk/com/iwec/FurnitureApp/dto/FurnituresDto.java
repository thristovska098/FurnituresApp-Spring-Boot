package mk.com.iwec.FurnitureApp.dto;

import java.util.LinkedList;
import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FurnituresDto {
	private List<FurnitureDto> furnitures = new LinkedList<FurnitureDto>();

}
