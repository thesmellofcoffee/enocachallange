package com.example.orkunenesyuksel.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testGettersAndSetters() {
        // Employee nesnesi oluşturma
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John Doe");

        // Getter'ları kullanarak değerleri kontrol etme
        Assertions.assertEquals(1L, employee.getId());
        Assertions.assertEquals("John Doe", employee.getName());
    }

    // Diğer testler...
}
