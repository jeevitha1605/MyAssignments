package week1.day1;

public class Mobile {
		public void makeCall() {
			String name="mobileModel";
			Float mobileWeight=6f;
					
			System.out.println("calling");
		}
		public void sendMsg()
		{
			boolean isFullCharged=true;
			int mobileCost=3000;
			System.out.println("This is my mobile");

}
public static void main(String[] args)
{
Mobile obj=new Mobile();
obj.sendMsg();
}
}
