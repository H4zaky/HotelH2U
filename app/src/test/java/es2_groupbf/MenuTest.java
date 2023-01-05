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
    @DisplayName("Test getOption method with value 1")
    void testGet_Option1() {
        menu.setOption(1);
        Assertions.assertEquals(1, menu.getOption());
    }

    @Test
    @DisplayName("Test getOption method with value 2")
    void testGet_Option2() {
        menu.setOption(2);
        Assertions.assertEquals(2, menu.getOption());
    }

    @Test
    @DisplayName("Test getOption method with value 3")
    void testGet_Option3() {
        menu.setOption(3);
        Assertions.assertEquals(3, menu.getOption());
    }

    @Test
    @DisplayName("Test setOption method with value 1")
    void testSet_Option1() {
        menu.setOption(1);
        Assertions.assertEquals(1, menu.getOption());
    }

    @Test
    @DisplayName("Test setOption method with value 2")
    void testSet_Option2() {
        menu.setOption(2);
        Assertions.assertEquals(2, menu.getOption());
    }

    @Test
    @DisplayName("Test setOption method with value 3")
    void testSet_Option3() {
        menu.setOption(3);
        Assertions.assertEquals(3, menu.getOption());
    }

    @Test
    @DisplayName("Test isExit method with value true")
    void testIsExit_True() {
        menu.setExit(true);
        Assertions.assertTrue(menu.isExit());
    }

    @Test
    @DisplayName("Test isExit method with value true")
    void testIsExit_False() {
        menu.setExit(false);
        Assertions.assertFalse(menu.isExit());
    }

    @Test
    @DisplayName("Test setExit method with value true")
    void testSetExit_True() {
        menu.setExit(true);
        Assertions.assertTrue(menu.isExit());
    }

    @Test
    @DisplayName("Test setExit method with value false")
    void testSetExit_False() {
        menu.setExit(false);
        Assertions.assertFalse(menu.isExit());
    }

    @Test
    @DisplayName("Test performAction method with option 0")
    void testPerformAction_Option0() {
        menu.setOption(0);
        menu.performAction();
        Assertions.assertTrue(menu.isExit());
    }

    @Test
    @DisplayName("Test performAction method with option 1")
    void testPerformAction_Option1() {
        menu.setOption(1);
        menu.performAction();
        Assertions.assertFalse(menu.isExit());
    }

    @Test
    @DisplayName("Test performAction method with option 2")
    void testPerformAction_Option2() {
        menu.setOption(2);
        menu.performAction();
        Assertions.assertFalse(menu.isExit());
    }

    @Test
    @DisplayName("Test performAction method with option 3")
    void testPerformAction_Option3() {
        menu.setOption(3);
        menu.performAction();
        Assertions.assertFalse(menu.isExit());
    }

    @Test
    @DisplayName("Test performAction method with invalid option")
    void testPerformAction_InvalidOption() {
        menu.setOption(-1);
        menu.performAction();
        Assertions.assertFalse(menu.isExit());
    }
}
