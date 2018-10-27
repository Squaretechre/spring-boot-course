package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
