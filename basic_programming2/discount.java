//pdf1 question-6
class discount
{
	public static void main(String[]args)
	{
		int fee=125000;
		int discountPercent=10;
		int discount= (fee*discountPercent)/100;
		int final_fees= fee-discount;
		System.out.println("the discount price is:" +discount);
		System.out.println("the final fees is:" +final_fees);
	}
}