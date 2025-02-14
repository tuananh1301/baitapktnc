package TestXeOto.Model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
