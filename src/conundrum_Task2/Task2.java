package conundrum_Task2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		// Запрашиваем дату у пользователя ввиде строки
		System.out.println("Enter a date (day.month.year).");
		String date=in.next();
		// Разбиваем на отдельные цифры.
	String day=date.substring(0, date.indexOf('.'));
	String month=date.substring(date.indexOf('.')+1, date.lastIndexOf('.'));
	String year= date.substring(date.lastIndexOf('.')+1);
	System.out.println(day+" "+month+" "+year);
	int dayInt=Integer.parseInt(day);
	int monthInt=Integer.parseInt(month);
	int yearInt=Integer.parseInt(year);
	//позволяет вводить только последние цифры года
	if(yearInt%10<10 && yearInt!=0){
		if(yearInt<=16) yearInt=yearInt+2000;
		else{yearInt=yearInt+1900;}
	}
	//to INT
	int dateInt= dayInt*1000000+monthInt*10000+yearInt;
	System.out.println("Your date - "+ dateInt);
	int d=(dateInt/1000000);
	int m=(byte)((dateInt-(d*1000000))/10000); 
	int y=(short)(dateInt%10000);
	//валидация данных
	int control=0;
	if (d<1 || d>=32) control=1;
	 if (m<1 || m>12) control=1;
	 if (y<1000 || y>9999) control=1;
if (control==0){
	System.out.print("day:"+d+"; month:"+m+"; year:"+y);}
else{
	System.out.println("incorrect date");}
	
	
	}
}
