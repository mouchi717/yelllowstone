import io.cucumber.java8.En

abstract class AbstractStepDefs : En {

    val browser = Browser()

    init {
        After { _ ->
            browser.quit()
        }
    }
}