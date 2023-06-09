package lk.ijse.hostelmanagement.bo;


import lk.ijse.hostelmanagement.bo.custom.impl.LoginBoImpl;
import lk.ijse.hostelmanagement.bo.custom.impl.ReservationBoImpl;
import lk.ijse.hostelmanagement.bo.custom.impl.RoomBoImpl;
import lk.ijse.hostelmanagement.bo.custom.impl.StudentBoImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {}

    public static BoFactory getInstance() {
        return (boFactory==null)
                ? boFactory = new BoFactory()
                : boFactory;
    }

    public SuperBo getBo(BOType boType) {
        switch (boType) {
            case USER:
                return new LoginBoImpl();
            case STUDENT:
                return new StudentBoImpl();
            case ROOM:
                return new RoomBoImpl();
            case RESERVATION:
                return new ReservationBoImpl();
            default:
                System.out.println("Class Not Found!");
                return null;
        }
    }
}
