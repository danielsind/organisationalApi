package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    public Department setupNewDepartment(){
        return new Department("accounting", "handles company's finance", 5);
    }
    @Test
    public void departmentInstantiatesCorrectly_true() {
        Department newDepartment = setupNewDepartment();
        assertEquals(true, newDepartment instanceof Department);
    }
}

