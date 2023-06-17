package lesson3.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private String authorSurname;
    private Integer price;
    private Integer year;
    private Integer pages;

}
