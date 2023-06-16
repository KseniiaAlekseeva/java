package lesson3.ClassWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cube {
    private Integer length;
    private String color;
    private String material;

    public Integer volumeCube() {
        return length * length * length;
    }
}
