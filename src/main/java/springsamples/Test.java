package springsamples;

interface PaymentMode{
 	void pay();
}

class Cash implements PaymentMode
{

	@Override
	public void pay() {
		System.out.println("paying thru cash");
		
	}
	
}
class Gpay implements PaymentMode
{
	public void pay()
	{
		System.out.println("paying thru gpay");
	}
}
class Upi implements PaymentMode
{
	
	public void pay()
	{
		System.out.println("paying thru upi");
	}
}
class CreditCard implements PaymentMode
{
	public void pay()
	{
		System.out.println("paying thru Creditcard");
	}
}
class Shopping
{
	 
	PaymentMode payment;
	public Shopping(PaymentMode payment)
	{
		this.payment=payment;
	}

	void checkout(int amount)
	{
		payment.pay();
		
	}
}
public class Test {

	public static void main(String[] args) {
		 
		Upi payment1 = new Upi();
	 
		CreditCard payment2= new CreditCard();
		Gpay payment3= new Gpay();
		
		Cash payment4 = new Cash();
		Shopping p1 = new Shopping(payment1);
		Shopping p2 = new Shopping(payment4);
		
		p1.checkout(1000);
		 p2.checkout(3000);
		
		
		
	}

}
