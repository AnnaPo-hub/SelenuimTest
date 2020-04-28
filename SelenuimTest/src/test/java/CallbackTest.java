import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CallbackTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/Caskroom");
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver(); }
    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null; }
    @Test
    void shouldTestSomething() {
       driver.get("http://localhost:9999");
    }

//    Thread.sleep(5000)
}
