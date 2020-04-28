import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface WebDriver extends SearchContext {
    void get(String url);
    String getCurrentUrl();
    String getTitle();
    List<WebElement> findElements(By by);
    WebElement findElement(By by);
    String getPageSource();
    void close();
    void quit();
}
