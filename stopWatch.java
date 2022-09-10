package com.stopwatch;
import java.util.Scanner;
import java.sql.*;
import java.time.Instant;

public class stopWatch {

	public static void main(String[] args) {
		System.out.println("Welcome Stop Watch Program");
		Scanner scanner = new Scanner(System.in);
		// Start Stop Watch
		while (true) {
			System.out.print("Start stop watch by entering 1 : ");
			int start = scanner.nextInt();
			if (start == 1) {
				break;
			}
		}
		Timestamp startTime= Timestamp.from(Instant.now());
		// Stop Stop Watch
		while (true) {
			System.out.print("Stop stop watch by entering 0 : ");
			int start = scanner.nextInt();
			if (start == 0) {
				break;
			}
		}
		Timestamp stopTime= Timestamp.from(Instant.now());
		long difference = stopTime.getTime() - startTime.getTime();
		long nanoSeconds = difference % 1000;
		difference /= 1000;
		long seconds = difference % 60;
		difference /= 60;
		long minutes = difference % 60;
		difference /= 60;
		long hours = difference;
		System.out.println(hours+" : "+minutes+" : "+seconds+" : "+nanoSeconds);
		scanner.close();
	}
}