package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework.FizzBuzzChecker.checkIfFizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {

    private int number;
    private String answer;



        @Given("number is 6")
        public void number_to_check_6() {
            this.number = 6;
        }
        @Given("number is 15")
        public void number_to_check_15() {
            this.number = 15;
        }
        @Given("number is 7")
        public void number_to_check_7() {
            this.number = 7;
        }
        @Given("number is 10")
        public void number_to_check_10() {
            this.number = 10;
        }
        @When("I check its divisibility by three and five")
        public void i_check_its_divisibility_by_three_and_five() {
            this.answer = checkIfFizzBuzz(this.number);
        }
        @Then("I should get a message {string}")
        public void i_should_get_a_message(String string) {
            assertEquals(string, this.answer);
        }
    }
