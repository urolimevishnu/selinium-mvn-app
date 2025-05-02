package com.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class AppTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up Chrome options to run in headless mode (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Runs Chrome in headless mode
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // Initialize the ChromeDriver
        driver = new ChromeDriver(options);
    }

    @Test
    public void testGooglePage() {
        // Open Google's homepage
        driver.get("https://www.google.com");

        // Check if the page title contains "Google"
        assertTrue(driver.getTitle().contains("Google"));
    }

    @Before
    public void tearDown() {
        // Quit the WebDriver after the test
        if (driver != null) {
            driver.quit();
        }
    }
}

