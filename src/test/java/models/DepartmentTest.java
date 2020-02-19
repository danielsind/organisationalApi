package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    public Department setupNewDepartment(){
        return new Department("IT", "Technology", 5);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void departmentInstantiatesCorrectly_true() {
        Department newDepartment = setupNewDepartment();
        assertEquals(true, newDepartment instanceof Department);
    }
    @Test
    public void getDepartmentNameReturnsNameCorrectly_String() {
        Department newDepartment = setupNewDepartment();
        assertEquals("IT", newDepartment.getDepartmentName());
    }

    @Test
    public void setDepartmentNameSetsCorrectDepartmentName() {
        Department newDepartment = setupNewDepartment();
        newDepartment.setDepartmentName("IT");
        assertEquals("IT", newDepartment.getDepartmentName());
    }
    @Test
    public void getDescriptionReturnsDescriptionCorrectly_String() {
        Department newDepartment = setupNewDepartment();
        assertEquals("Technology", newDepartment.getDescription());
    }

    @Test
    public void setDescriptionSetsCorrectDescription_String() {
        Department newDepartment = setupNewDepartment();
        newDepartment.setDescription("Technology");
        assertEquals("Technology", newDepartment.getDescription());
    }

    @Test
    public void getNumbersOfEmployeesReturnsNumberOfEmployeesCorrectly_int() {
        Department newDepartment = setupNewDepartment();
        assertEquals(5, newDepartment.getNumberOfEmployees());
    }

    @Test
    public void setNumbersOfEmployeesSetsCorrectNumberOfEmployees_int() {
        Department newDepartment = setupNewDepartment();
        newDepartment.setNumberOfEmployees(3);
        assertEquals(3, newDepartment.getNumberOfEmployees());
    }

    @Test
    public void departmentReturnsTrueIfDepartmentNameAndDescriptionAndNumberOfEmployeesAreSame() {
        Department newDepartment = setupNewDepartment();
        Department anotherDepartment = setupNewDepartment();
        assertEquals(true, newDepartment.equals(anotherDepartment));
    }

}

