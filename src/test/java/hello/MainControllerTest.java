package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainControllerTest {

    @Test
    public void test() {
        User user = User.builder()
                .email("email")
                .name("name")
                .build();
        assertEquals("name", user.getName());
    }
}
