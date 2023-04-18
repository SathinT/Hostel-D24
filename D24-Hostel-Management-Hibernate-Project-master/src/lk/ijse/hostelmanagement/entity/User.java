package lk.ijse.hostelmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User implements SuperEntity{
    @Id
    @Column(name = "user_id", nullable = false)
    private String id;
    @Column(name = "user_Full_name", nullable = false)
    private String name;
    @Column(name = "user_email", nullable = false)
    private String email;
    @Column(name = "userName", nullable = false, unique = true)
    private String userName;
    @Column(name = "user_password", nullable = false)
    private String password;
}
