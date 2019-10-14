package steps

import io.cucumber.java8.En
import org.junit.jupiter.api.Assertions.assertEquals

class StepDefs : En {
    init {
        Given("I have {int} cukes in my belly") { size: Int ->
            assertEquals(42, size)
        }

        When("I wait {int} hour") { hour: Int ->
            assertEquals(1, hour)
        }

        Then("my belly should growl") {

        }
    }
}