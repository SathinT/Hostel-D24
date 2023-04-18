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

import java.util.ArrayList;
import java.util.stream.Collectors;

public class LoginBoImpl implements LoginBo {


    UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOType.USER);

    @Override
    public UserDTO getUser(String id) {
        return null;
    }

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

    @Override
    public boolean updateUser(UserDTO userDTO) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public ArrayList<UserDTO> getAllUser() {
        ArrayList<UserDTO> userList = new ArrayList<>();
        userList.addAll(userDAO.getAll().stream().map(user -> {
            return new UserDTO(
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getUserName(),
                    user.getPassword()
            );
        }).collect(Collectors.toList()));

        return userList;
    }
}
