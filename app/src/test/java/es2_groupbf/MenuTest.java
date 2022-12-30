package es2_groupbf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuTest {
    Menu menu;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
    }

    @Test
    @DisplayName("Setting option value as integer being valid")
    public void setOption() {
        menu.setOption(1);
        Assertions.assertEquals(1, menu.getOption(), "This test should assign 1 to option class property");
    }

    @Test
    @DisplayName("Setting exit value as boolean being valid")
    public void setExit() {
        menu.setExit(true);
        Assertions.assertTrue(menu.isExit(), "This test should assign true to exit class property");
    }

    @Test
    @DisplayName("Getting option value as integer being valid")
    public void getOption() {
        Assertions.assertEquals(0, menu.getOption(), "This test should get 0 to option class property");
    }

    @Test
    @DisplayName("Getting exit value as boolean being valid")
    public void getExit() {
        Assertions.assertFalse(menu.isExit(), "This test should get false to exit class property");
    }

    @Test
    @DisplayName("Verify state of class Menu")
    public void menuNotNull() {
        Assertions.assertNotNull(menu, "This test should get not null for class Menu");
    }
}
