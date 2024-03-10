package org.jt.curd.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.jt.curd.model.Employee;
import org.jt.curd.service.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/emp")
@RequiredArgsConstructor
public class EmpController {
    private  final EmpService empService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return empService.insertData(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id){
        empService.deleteData(id);
    }

    @GetMapping("/alldata")
    public List<Employee> allData(){
        return empService.getAll();
    }

    @GetMapping("/byid/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return empService.getById(id);
    }
}
