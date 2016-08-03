package conundrum_Task1;

public class Task1_simplified {
	public static void main(String[] args) {
		byte day=16;
		byte month=3;
	    short year=1997; 
	   int data=day*1000000+month*10000+year;
		System.out.print(data);
		byte d=(byte)(data/1000000);
		byte m=(byte)((data-(d*1000000))/10000); 
		short y=(short)(data%10000);
		System.out.print("day:"+d+"; month:"+m+"; year:"+y);
		}
}
