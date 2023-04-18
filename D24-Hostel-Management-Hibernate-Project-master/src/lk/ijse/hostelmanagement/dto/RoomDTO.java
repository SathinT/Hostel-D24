package lk.ijse.hostelmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomDTO {
    private String id;
    private String type;
    private String keyMoney;
    private int qty;
}
