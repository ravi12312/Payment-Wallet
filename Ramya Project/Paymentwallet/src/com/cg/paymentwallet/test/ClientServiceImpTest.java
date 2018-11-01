package com.cg.paymentwallet.test;

import static org.junit.Assert.assertFalse;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.exception.ClientException;
import com.cg.paymentwallet.service.ClientServiceImp;
import com.cg.paymentwallet.service.IClientService;

public class ClientServiceImpTest {
	private static IClientService clientService = null;

	@BeforeClass
	public static void createInstance() {
		clientService = new ClientServiceImp();
	}

	@Test
	public void testFirstNameForLengthPositive() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = false;
		result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testFirstNameForLengthMin() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("nih");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = true;
		result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testFirstNameForLengthNull() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName(" ");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = false;
		result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testFirstNameForLengthAlphaNumeric() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha123");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = false;
		result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testFirstNameForLengthNumeric() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("1234");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = true;
		result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testMailIdPositive() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testMailIdWithoutDot() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmailcom");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testMailIdWithoutcom() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testMailIdnull() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId(" ");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testMobilenumberPositive() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786533"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testMobilenumberLessThanLength() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("81067865"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testMobileNumberGreaterThanLength() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786590008"));
		client.setBalance(8900.00);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testBalanceLessThanValue() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("9876543210"));
		client.setBalance(0.0);
		client.setAddress("fhsjkdyufweihsdjkl");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));

		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test(expected = ClientException.class)
	public void testAddressNull() throws ClientException {
		ClientBean client = new ClientBean();
		client.setFirstName("niha");
		client.setLastName("hsdgfyusd");
		client.setEmailId("ygftsdbh@gmail.com");
		client.setMobileNumber(new BigInteger("8106786590008"));
		client.setBalance(900.00);
		client.setAddress(" ");
		client.setAlternateMobileNumber(new BigInteger("8106786533"));
		boolean result = clientService.createAccount(client);
		assertFalse(result);
	}

	@Test
	public void testShowBalance() throws ClientException {
		double result = clientService.showBalance(new BigInteger("8976543210"));
		Assert.assertEquals(9000.00, result, 0);
	}

	@Test
	public void testShowBalanceForNegative() throws ClientException {
		double result = clientService.showBalance(new BigInteger("8976543210"));
		Assert.assertNotEquals(7000.00, result, 0);
	}

	@Test
	public void testDepositForAmount() throws ClientException {
		double result = clientService.deposit(new BigInteger("8976543210"), 1000.00);
		Assert.assertNotEquals(10000.00, result, 0);
	}

	@Test
	public void testDepositForAmountGreater() throws ClientException {
		double result = clientService.deposit(new BigInteger("8976543210"), 9000.00);
		Assert.assertEquals(18000.00, result, 0);
	}

	@Test(expected = ClientException.class)
	public void testWithdrawForAmountMore() throws ClientException {
		double result = clientService.withdraw(new BigInteger("8976543210"), 9000.00);
		Assert.assertEquals(6000.00, result, 0);
	}

	@Test
	public void testWithdrawForAmount() throws ClientException {
		double result = clientService.withdraw(new BigInteger("8976543210"), 6000.00);
		Assert.assertNotEquals(3000.00, result, 0);
	}

		
	
	
	
	
	
	
	
	
	
	
}
