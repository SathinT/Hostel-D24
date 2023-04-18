package lk.ijse.hostelmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Reservation implements SuperEntity{
    @Id
    @Column(name = "reservation_id", nullable = false)
    private String id;
    @Column(name = "reservation_date", nullable = false)
    private Date date;
    @Column(name = "reservation_status", nullable = false)
    private String states;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "room_type_id", referencedColumnName = "room_type_id", nullable = false)
    private Room room;
}


