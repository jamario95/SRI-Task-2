package Library_s34224.sri_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
    private float price;
    private int stockQuantity;
}
