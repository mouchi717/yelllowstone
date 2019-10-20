import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.ui.WebDriverWait

class Browser {
    private lateinit var driver: RemoteWebDriver
    lateinit var driverWait: WebDriverWait

    init {
        launch()
    }

    fun open(url: String) {
        if (!isLaunch()) {
            launch()
        }
        driver.get(url)
    }

    private fun isLaunch(): Boolean = driver.sessionId != null

    private fun launch() {
        driver = ChromeDriver(ChromeOptions().setHeadless(true))
        driverWait = WebDriverWait(driver, 20)
    }

    fun quit() {
        driver.quit()
    }

    fun findElement(by: By): WebElement {
        return driver.findElement(by)
    }
}