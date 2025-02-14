package TestXeOto.TestCN;

import TestXeOto.Model.Employees;
import TestXeOto.Service.EmployeesService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EmployeesTest {
    EmployeesService empService;

    @BeforeEach
    public void setup() {
        empService = new EmployeesService();
    }

    @Test
    public void testAddEmployee() {
        Employees emp = new Employees(1, "John", "Doe", "john@example.com");
        empService.addEmployee(emp);
        Assertions.assertEquals(1, empService.getAll().size());
    }

    @Test
    public void testUpdateEmployee() {
        Employees emp = new Employees(1, "John", "Doe", "john@example.com");
        empService.addEmployee(emp);
        Employees updatedEmp = new Employees(1, "Jane", "Doe", "jane@example.com");
        empService.updateEmployee(updatedEmp, 1);
        Assertions.assertEquals("Jane", empService.getAll().get(0).getFirstName());
    }

    @Test
    public void testDeleteEmployee() {
        Employees emp = new Employees(1, "John", "Doe", "john@example.com");
        empService.addEmployee(emp);
        empService.deleteEmployee(1);
        Assertions.assertEquals(0, empService.getAll().size());
    }

    @Test
    public void testSearchEmployee() {
        Employees emp = new Employees(1, "John", "Doe", "john@example.com");
        empService.addEmployee(emp);
        Employees found = empService.searchEmployee(1);
        Assertions.assertNotNull(found);
        Assertions.assertEquals("John", found.getFirstName());
    }
}
