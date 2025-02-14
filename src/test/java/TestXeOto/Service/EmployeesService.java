package TestXeOto.Service;

import TestXeOto.Model.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeesService {
    private List<Employees> employeesList = new ArrayList<>();

    public void addEmployee(Employees emp) {
        employeesList.add(emp);
    }

    public void updateEmployee(Employees emp, int id) {
        for (Employees e : employeesList) {
            if (e.getId() == id) {
                e.setFirstName(emp.getFirstName());
                e.setLastName(emp.getLastName());
                e.setEmail(emp.getEmail());
            }
        }
    }

    public void deleteEmployee(int id) {
        employeesList.removeIf(e -> e.getId() == id);
    }

    public Employees searchEmployee(int id) {
        return employeesList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Employees> getAll() {
        return employeesList;
    }
}
