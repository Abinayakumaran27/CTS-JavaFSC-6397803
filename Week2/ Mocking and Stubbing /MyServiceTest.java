package com.bank;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: Create mock and stub its method
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: Inject mock and call the method
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: Validate expected result
        assertEquals("Mock Data", result);
    }
}
