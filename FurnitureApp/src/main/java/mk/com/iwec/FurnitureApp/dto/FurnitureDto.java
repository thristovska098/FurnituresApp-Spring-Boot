package mk.com.iwec.FurnitureApp.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class FurnitureDto {
	@NonNull
	private String type;
	private Integer wood;
	private Integer glass;
	private Integer plastic;

	public FurnitureDto(String type, Integer wood) {
		this.type = type;
		this.wood = wood;
	}

	public FurnitureDto(String type, Integer wood, Integer glass) {
		this.type = type;
		this.wood = wood;
		this.glass = glass;
	}

	public FurnitureDto(String type, Integer wood, Integer glass, Integer plastic) {
		this.type = type;
		this.wood = wood;
		this.glass = glass;
		this.plastic = plastic;
	}

}