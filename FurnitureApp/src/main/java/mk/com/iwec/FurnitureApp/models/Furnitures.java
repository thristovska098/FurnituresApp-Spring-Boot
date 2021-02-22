package mk.com.iwec.FurnitureApp.models;

import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor
public class Furnitures {
	private List<Furniture> furnitures = new LinkedList<Furniture>();

}
