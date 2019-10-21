package steps

import AbstractStepDefs
import org.junit.jupiter.api.Assertions.assertEquals
import org.openqa.selenium.By

class StepDefs : AbstractStepDefs() {

    init {
        Given("I have {int} cukes in my belly") { size: Int ->
            assertEquals(42, size)
        }

        When("I wait {int} hour") { hour: Int ->
            assertEquals(1, hour)
        }

        Then("my belly should growl") {

        }

        Given("I am on the Google search page") {
            browser.open("https:\\www.google.com")
        }
        When("^I search for \"(.*)\"$") { query: String ->
            val element = browser.findElement(By.name("q"))
            element.sendKeys(query)
            element.submit()
        }

        Then("^the page title should start with \"(.*)\"$") { titleStartsWith: String ->
            browser.driverWait.until { d ->
                d.title.toLowerCase().startsWith(titleStartsWith)
            }
        }
    }
}