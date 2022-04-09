package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorSteps {
	
	int result=0;

	@Given("I have successfully opened calculator app")
	public void i_have_successfully_opened_calculator_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		result = num1 + num2;
	}

	@Then("I should see result as {int}")
	public void i_should_see_result_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(res, result);
	}

	@When("I subtract {int} and {int}")
	public void i_subtract_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		result = num1 - num2;
	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		int rows = dataTable.height();
		for(int i=0;i<rows;i++) {
			result = result + Integer.parseInt(dataTable.cell(i,0));
		}
	}
	

@When("I add below numbers using list")
public void i_add_below_numbers_using_list(List<Integer> numbers) {
	
	for(Integer num: numbers) {
		result = result + num;	
	}

}


@When("I order below items")
public void i_order_below_items(Map<String, Integer> priceList) {

	for(String key: priceList.keySet()) {
		//System.out.println("Key is : " +val);
		//System.out.println("value is : " +priceList.get(val)); // to get value as well
		result = result + priceList.get(key);
	}
}


@When("I order below items and quantity")
public void i_order_below_items_and_quantity(io.cucumber.datatable.DataTable dataTable) {

	int quantity =0;
	int val=0;
	int rows = dataTable.height();
	for(int i=0;i<rows;i++) {
		//for(int j=0;j<)
		quantity = Integer.parseInt(dataTable.cell(i,1));
		val = Integer.parseInt(dataTable.cell(i,2));
		result = result + (quantity * val);
	}

}


}
