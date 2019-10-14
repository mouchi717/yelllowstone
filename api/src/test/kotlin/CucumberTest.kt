import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
        plugin = ["pretty", "summary"],
        glue = ["steps"]
)
class RunCucumber

@RunWith(Cucumber::class)
@CucumberOptions(
        plugin = ["pretty", "summary"],
        glue = ["steps"],
        tags = ["@now"]
)
class RunCucumberNow
