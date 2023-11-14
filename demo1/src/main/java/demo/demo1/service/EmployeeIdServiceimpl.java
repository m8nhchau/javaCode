//package demo.demo1.service;
//
//import demo.demo1.dto.responseDTO.EmployeeIdDto;
//import demo.demo1.entity.Employee;
//import demo.demo1.mapper.EmployeeMapper;
//import demo.demo1.repository.EmployeeIdRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EmployeeIdServiceimpl implements EmployeeIdServices {
//    @Autowired
//    private EmployeeIdRepository employeeIdRepository;
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
////    @Override
////    public List<EmployeeIdDto> getAllSuperEmployee() {
////        return employeeIdRepository.getAll;
////    }
//
//    @Override
//    public List<EmployeeIdDto> getAllSuperEmployee() {
//        return null;
//    }
//
//    @Override
//    public List<EmployeeIdDto> getfindBySuperiorEmpId(Integer id){
//
//        List<Employee> employees = employeeIdRepository.getAllSuperEmployee();
////        List<EmployeeIdDto> employeeIdDtos = new ArrayList<>();
////        for (Employee empl : employees) {
////            EmployeeIdDto dtoSempid = new EmployeeIdDto();
////            dtoSempid.setEmpId(empl.getEmpId());
////            dtoSempid.setLastName(empl.getLastName());
////            dtoSempid.setFirstName(empl.getFirstName());
////            employeeIdDtos.add( dtoSempid);
////        }
//        List<EmployeeIdDto> employeeIdDtos = employeeMapper.toDtos(employees);
//        return employeeIdDtos;
//
//
//    }
//
//}
