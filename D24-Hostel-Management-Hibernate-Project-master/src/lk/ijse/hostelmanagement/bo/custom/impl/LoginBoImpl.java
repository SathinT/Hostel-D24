package lk.ijse.hostelmanagement.bo.custom.impl;


import lk.ijse.hostelmanagement.bo.custom.LoginBo;
import lk.ijse.hostelmanagement.dao.DAOFactory;
import lk.ijse.hostelmanagement.dao.DAOType;
import lk.ijse.hostelmanagement.dao.custom.StudentDAO;
import lk.ijse.hostelmanagement.dao.custom.UserDAO;
import lk.ijse.hostelmanagement.dao.custom.impl.UserDAOImpl;
import lk.ijse.hostelmanagement.dto.UserDTO;
import lk.ijse.hostelmanagement.entity.User;
import lk.ijse.hostelmanagement.repository.UserRepository;

public class LoginBoImpl implements LoginBo {

    /*UserRepository userRepository = new UserRepository();*/
    UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOType.USER);

    @Override
    public boolean addUser(UserDTO userDTO) {
        /*return userRepository.addUser(new User(userDTO.getId(), userDTO.getName(), userDTO.getUserName(), userDTO.getPassword()));*/
        return userDAO.add(new User(
//           userDTO.getId(),
//           userDTO.getName(),
//           userDTO.getUserName(),
//           userDTO.getPassword()
        ));
    }
}
