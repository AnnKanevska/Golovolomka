package conundrum_Task1;

import java.util.Scanner;
public class Task1 {
	public static void main(String[] args){
		boolean control=false;//дл€ проверки записи правильной даты
		byte day,month;short year;
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the date");
        do{
        	System.out.print("day:");
        	day=in.nextByte();// запись дн€
        	if (day>=1 || day<32) control=true;
        	else{System.out.println("Oops! Date should be in the range from 1 to 31. Try again.");}
        }
        while(control==false);
        control=false;// "ќбнуление";
        do{ 
        	System.out.print("month:");
            month=in.nextByte();//запись мес€ца
            if (month>=1 || month<=12) control=true;
        	else{System.out.println("Oops! Date should be in the range from 1 to 12. Try again.");}
        } 
        while(control==false);
        control=false;// "ќбнуление";
        do{  
        	System.out.print("year (4 digits):");
            year=in.nextShort();//запись года
            if (year>=1000 || year<=9999) control=true;
        	else{System.out.println("Oops! The number must contain 4 digits. Try again.");}
        }while(control==false);
        System.out.println("date:"+toint(day, month, year));
        fromint(toint(day, month, year));
	}

public static int toint(byte day, byte month, short year){
	int date=day*1000000+month*10000+year;
	return (date);
}
public static void fromint(int date){
	byte d=(byte)(date/1000000);
	byte m=(byte)((date-(d*1000000))/10000); 
	short y=(short)(date%10000);
	System.out.print("day:"+d+"; month:"+m+"; year:"+y);
	// from INT
}

}
