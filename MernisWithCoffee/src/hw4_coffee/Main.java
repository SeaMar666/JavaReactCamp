package hw4_coffee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws Exception{

		Customer realCustomer = new Customer(1,"Deniz ","Ayg�n",new Date(1999,9,6),"41554564228");
		Customer fakeCustomer = new Customer(2,"Engin","Demirog",new Date(1989,2,11),"12345678901");
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);
        

	}

}
