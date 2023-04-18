package lk.ijse.hostelmanagement.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomTM {
    private String id;
    private String type;
    private String keyMoney;
    private int qty;
}
