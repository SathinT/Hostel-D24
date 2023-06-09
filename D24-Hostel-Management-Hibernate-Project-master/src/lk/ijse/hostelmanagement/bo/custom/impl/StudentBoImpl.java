package lk.ijse.hostelmanagement.bo.custom.impl;


import lk.ijse.hostelmanagement.bo.custom.StudentBO;
import lk.ijse.hostelmanagement.dao.DAOFactory;
import lk.ijse.hostelmanagement.dao.DAOType;
import lk.ijse.hostelmanagement.dao.custom.StudentDAO;
import lk.ijse.hostelmanagement.dto.StudentDTO;
import lk.ijse.hostelmanagement.entity.Student;
import lk.ijse.hostelmanagement.repository.StudentRepository;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentBoImpl implements StudentBO {
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOType.STUDENT);
    @Override
    public StudentDTO getStudent(String id) {
        Student student = studentDAO.search(id);
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getAddress(),
                student.getDob(),
                student.getGender(),
                student.getCampus(),
                student.getNumber()
        );
    }

    @Override
    public boolean addStudent(StudentDTO studentDTO) {
        return studentDAO.add(new Student(
           studentDTO.getId(),
           studentDTO.getName(),
           studentDTO.getAddress(),
           studentDTO.getDob(),
           studentDTO.getGender(),
           studentDTO.getCampus(),
           studentDTO.getContact()
        ));
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) {
        return studentDAO.update(new Student(
                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getAddress(),
                studentDTO.getDob(),
                studentDTO.getGender(),
                studentDTO.getCampus(),
                studentDTO.getContact()
        ));
    }

    @Override
    public boolean deleteStudent(String id) {
        return studentDAO.delete(id);
    }

    @Override
    public ArrayList<StudentDTO> getAllStudent() {
        ArrayList<StudentDTO> studentList = new ArrayList<>();
        studentList.addAll(studentDAO.getAll().stream().map(student -> {return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getAddress(),
                student.getDob(),
                student.getGender(),
                student.getCampus(),
                student.getNumber());
        }).collect(Collectors.toList()));
        return studentList;
    }
}
