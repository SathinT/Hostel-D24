package lk.ijse.hostelmanagement.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationTM {
    private String id;
    private Date date;
    private String states;
    private String studentId;
    private String roomId;
}
