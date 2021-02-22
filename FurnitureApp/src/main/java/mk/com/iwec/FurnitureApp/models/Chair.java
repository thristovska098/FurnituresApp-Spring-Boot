package mk.com.iwec.FurnitureApp.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import static mk.com.iwec.FurnitureApp.util.Constants.WOOD_PRICE;
import static mk.com.iwec.FurnitureApp.util.Constants.GLASS_PRICE;

@NoArgsConstructor
@AllArgsConstructor
public class Chair implements Furniture {
	private Integer wood;
	private Integer glass;

	@Override
	public Integer calculateCost() {
		return wood * WOOD_PRICE + glass * GLASS_PRICE;
	}

}
