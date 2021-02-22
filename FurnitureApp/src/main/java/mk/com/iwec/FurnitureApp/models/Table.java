package mk.com.iwec.FurnitureApp.models;

import static mk.com.iwec.FurnitureApp.util.Constants.WOOD_PRICE;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static mk.com.iwec.FurnitureApp.util.Constants.GLASS_PRICE;
import static mk.com.iwec.FurnitureApp.util.Constants.PLASTIC_PRICE;

@NoArgsConstructor
@AllArgsConstructor
public class Table implements Furniture {
	private Integer wood;
	private Integer glass;
	private Integer plastic;

	@Override
	public Integer calculateCost() {
		return wood * WOOD_PRICE + plastic * PLASTIC_PRICE + glass * GLASS_PRICE;
	}

}
