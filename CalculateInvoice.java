// 1.	Create a class called Invoice that a hardware store might use to represent an invoice for an item sold  at  the  store.  An  Invoice  should  include  four  pieces  of  information  as  instance variables-a part number(type String),a part description(type String),a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoiceAmount that calculates the invoice amount.

class InVoice{
	String partNum;
	String partDescription;
	int quantity;
	double price;
	
	InVoice(String partNum,String partDescription,int quantity,double price){
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	double getInvoiceAmount() {
		return quantity * price;
	}
	
}

public class CalculateInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InVoice invoice = new InVoice("3452","Engine",3,50000);
		
		System.out.println("Part Number:" + invoice.partNum);
		System.out.println("Part Description: "+ invoice.partDescription);
		System.out.println("Quantity: "+ invoice.quantity);
		System.out.println("Price: "+ invoice.price);
		System.out.println("Total Amount: "+ invoice.getInvoiceAmount());

	}

}
