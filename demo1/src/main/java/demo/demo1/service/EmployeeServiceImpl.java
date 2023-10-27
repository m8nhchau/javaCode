//package demo.demo1.service;
//
//import demo.demo1.dto.EmployeeDto;
//import demo.demo1.entity.Employee;
//import demo.demo1.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    @Autowired
//        private EmployeeRepository employeeRepository;
//
//        @Override
//        public List<EmployeeDto> getEmployeesStartedAfter2001() throws ParseException {
//            Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001");
//            List<Employee> employees = employeeRepository.findByStartDateAfter(startDate);
//            List<EmployeeDto> listEmployeeDtos = new ArrayList<>();
//            for (Employee empl : employees) {
//                EmployeeDto dto = new EmployeeDto();
//                dto.setEmpId(empl.getEmpId());
//                dto.setLastName(empl.getLastName());
//                dto.setFirstName(empl.getFirstName());
//                dto.setTitle(empl.getTitle());
//                dto.setStartDate(empl.getStartDate());
//                listEmployeeDtos.add(dto);
//            }
//            return listEmployeeDtos;
//        }
//}
//
