package lk.ijse.hostelmanagement.controller;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lk.ijse.hostelmanagement.bo.BOType;
import lk.ijse.hostelmanagement.bo.BoFactory;
import lk.ijse.hostelmanagement.bo.custom.ReservationBo;

public class ViewUsersFormController {
    public TableView tblUser;
    public TableColumn colUserId;
    public TableColumn colUserName;
    public TableColumn colUName;
    public TableColumn colPasword;

    ReservationBo reservationBo = (ReservationBo) BoFactory.getInstance().getBo(BOType.RESERVATION);
}
