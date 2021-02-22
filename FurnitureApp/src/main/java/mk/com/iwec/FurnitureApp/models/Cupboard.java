package mk.com.iwec.FurnitureApp.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import static mk.com.iwec.FurnitureApp.util.Constants.WOOD_PRICE;

@AllArgsConstructor
@NoArgsConstructor
public class Cupboard implements Furniture {
	private Integer wood;

	@Override
	public Integer calculateCost() {
		return wood * WOOD_PRICE;
	}

}
