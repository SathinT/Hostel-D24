package lk.ijse.hostelmanagement.dao;


import lk.ijse.hostelmanagement.dao.custom.impl.ReservationDAOImpl;
import lk.ijse.hostelmanagement.dao.custom.impl.RoomDAOImpl;
import lk.ijse.hostelmanagement.dao.custom.impl.StudentDAOImpl;
import lk.ijse.hostelmanagement.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return (daoFactory == null)
                ? daoFactory = new DAOFactory()
                : daoFactory;
    }

    public SuperDAO getDAO(DAOType daoType) {
        switch (daoType) {
            case USER:
                return new UserDAOImpl();
            case STUDENT:
                return new StudentDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            case RESERVATION:
                return new ReservationDAOImpl();
            default:
                System.out.println("No DAOImpl!");
                return null;
        }
    }
}
