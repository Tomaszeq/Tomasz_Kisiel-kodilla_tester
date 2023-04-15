package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class WalletSteps {
    private int amount;
    private int withdraw;
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer int1) {
        this.amount = 200;
        wallet.deposit(200);
        Assertions.assertEquals( 200, wallet.getBalance());
    }
    @Given("I have deposited $600 in my wallet")
    public void i_have_deposited_$600_in_my_wallet() {
        this.amount = 600;
        wallet.deposit(600);
        Assertions.assertEquals( 600, wallet.getBalance());
    }
    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        this.amount = 0;
        wallet.deposit(0);
        Assertions.assertEquals( 0, wallet.getBalance());
    }
    @Given("I have deposited $2000 in my wallet")
    public void i_have_deposited_$2000_in_my_wallet() {
        this.amount = 2000;
        wallet.deposit(2000);
        Assertions.assertEquals( 2000, wallet.getBalance());
    }
    @When("I request {int}")
    public void i_request(Integer int1) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @When("I request $600")
    public void i_request_$600() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @When("I request $1500")
    public void i_request_$1500() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @Then("should be dispensed")
    public void should_be_dispensed() {
        Assertions.assertEquals(this.withdraw, cashSlot.getContents());
    }
}
