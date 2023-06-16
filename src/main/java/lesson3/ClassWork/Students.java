package lesson3.ClassWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    private String surname;
    private Integer group;
    private  Integer salary;
    private List<Integer> marks;
}
