package web_intro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	private Long id;
	private String title;
	private String author;
	private String isbn;
	private Double price;
	private String description;
	private String coverImage;
}
