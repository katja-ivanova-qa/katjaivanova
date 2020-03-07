import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DelfiHomework {

    private final By ARTICLE = By.xpath(".//article[contains(@class, 'headline')]");
    private final Logger LOGGER = LogManager.getLogger(DelfiHomework.class);
    private final By HOME_PAGE_ARTICLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//a[contains (@class, 'text-red-ribbon')]");

    @Test

    public void delfiHomeorkOne() {

        LOGGER.info("Setting up driver path");
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        LOGGER.info("Opening browser");
        WebDriver driver = new ChromeDriver();

        LOGGER.info("Mazimizing window");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        LOGGER.info("Opening Delfi home page");
        driver.get("https://rus.delfi.lv/");

        LOGGER.info("Find articles");
        List<WebElement> articles = driver.findElements(ARTICLE);
        for (int i = 0; i < articles.size(); i++) {
            System.out.println(articles.get(i)); }

        LOGGER.info("Find second article");
        WebElement secondArticle = articles.get(1);

        LOGGER.info("Find second article title and save it");
        String secondArticleTitleText = secondArticle.findElement(HOME_PAGE_ARTICLE).getText();

        LOGGER.info("Click on second article");
        secondArticle.click();

        LOGGER.info("Find article title");
        WebElement articleTitle = driver.findElement(ARTICLE_PAGE_TITLE);

        LOGGER.info("Find article title and save it");
        String articleTitleText = articleTitle.getText();

        LOGGER.info("Find comments if there are");
        List<WebElement> comments = driver.findElements(COMMENT_PAGE_TITLE);
        for (int i = 0; i<1; i++) {
            if (comments.isEmpty()) {
                System.out.println();
            } else {
                System.out.println(comments.get(i));
            }
        }

        LOGGER.info("Find article comments");
        WebElement commentElement = comments.get(0);

        LOGGER.info("Click on comments");
        commentElement.click();

        LOGGER.info("Find article title on comments page");
        WebElement commentArticleTitle = driver.findElement(By.className("article-title"));

        LOGGER.info("Find article title and save it");
        String commentArticleTitleText = commentArticleTitle.getText();



        Assertions.assertEquals(secondArticleTitleText, articleTitleText,  "Title are not equals!");






    }

}