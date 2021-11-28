package week1.day1;

public class Mobile{
	String mobileModel="edhudhuvandha";
	int mobileWeight=50;
	boolean isFullcharge=true;
	double mobileCost=12500.50;
	

	public static void main(String[] args) {
		Mobile myphone=new Mobile();
		Mobile telephone=new Mobile();
		myphone.makeCall();
		myphone.sendMsg();
		System.out.println(myphone.mobileModel);
		System.out.println(myphone.mobileWeight);
		System.out.println("my mobile is full charge"+" "+myphone.isFullcharge);
		System.out.println(telephone.mobileCost);	
		
	}
	public void makeCall() {
		System.out.println("calling");
	}
	public void sendMsg() {
		System.out.println("sending");
	}
}
