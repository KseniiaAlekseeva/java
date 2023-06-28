package lesson6.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notebook {
    private String name;
    private Integer ram;
    private Integer hd;
    private String os;
    private String color;
    private Integer price;
}
