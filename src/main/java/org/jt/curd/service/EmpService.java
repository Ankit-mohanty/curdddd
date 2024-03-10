package org.jt.curd.service;

import lombok.RequiredArgsConstructor;
import org.jt.curd.model.Employee;
import org.jt.curd.repo.EmpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpService {
    private final EmpRepository empRepository;

    public Employee insertData(Employee employee) {
        return empRepository.save(employee);
    }

    public void deleteData(int id) {
        empRepository.deleteById(id);
    }

    public Employee getById(int id) {
        return empRepository.findById(id).orElseThrow();
    }

    public List<Employee> getAll() {
        return empRepository.findAll();
    }
}
