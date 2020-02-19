package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    public Department setupNewDepartment(){
        return new Department("accounting", "handles company's finance", 5);
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
        assertEquals("accounting", newDepartment.getDepartmentName());
    }

    @Test
    public void setDepartmentNameSetsCorrectDepartmentName() {
        Department newDepartment = setupNewDepartment();
        newDepartment.setDepartmentName("statistics");
        assertEquals("statistics", newDepartment.getDepartmentName());
    }
}

