package org.example.tests;

import org.example.utils.PageFactory;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest {
    private PageFactory pageFactory;
    private Page page;

    @BeforeEach
    public void setup() {
        pageFactory = new PageFactory();
        page = pageFactory.getPage();
    }

    @Test
    public void testLogin() {
        // Navigate to login page
        page.navigate("https://the-internet.herokuapp.com/login");

        // Fill in login form
        page.fill("#username", "tomsmith");
        page.fill("#password", "SuperSecretPassword!");
        page.click("button[type='submit']");

        // Verify successful login
        String successMessage = page.locator(".flash.success").textContent();
        assertTrue(successMessage.contains("You logged into a secure area!"),
                "Login was not successful");
    }

    @AfterEach
    public void teardown() {
        pageFactory.close();
    }
}
