package lk.ijse.hostelmanagement.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTM {
    private String id;
    private String name;
    private String email;
    private String userName;
    private String password;
}
