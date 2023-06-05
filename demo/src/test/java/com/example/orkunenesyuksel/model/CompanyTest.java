package com.example.orkunenesyuksel.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    public void testGettersAndSetters() {
        // Company nesnesi oluşturma
        Company company = new Company();
        company.setId(1L);
        company.setName("Example Company");

        // Getter'ları kullanarak değerleri kontrol etme
        Assertions.assertEquals(1L, company.getId());
        Assertions.assertEquals("Example Company", company.getName());
    }

    // Diğer testler...
}
