package lk.ijse.hostelmanagement.dto;


import lk.ijse.hostelmanagement.entity.Room;
import lk.ijse.hostelmanagement.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {
    private String id;
    private Date date;
    private String states;
    private String studentId;
    private String roomId;
}
