package iban_harnak;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  String IBAN = scanner.next();
	      
	      System.out.println( getCountryCodeFromIban(IBAN));
	      System.out.println( getBankCodeFromIban(IBAN));
	      System.out.println( getAccountNumber(IBAN));
	      System.out.println( getBankName(IBAN));
	      System.out.println( isIbanValid(IBAN));

	      scanner.close();	
	}
	private static String getCountryCodeFromIban(String IBAN) {
		String CountryCodeFromIban = IBAN.substring(0, 2);
		return CountryCodeFromIban;
	}
	private static String getBankCodeFromIban(String IBAN) {
		String BankCodeFromIban = IBAN.substring(4, 8);
		return BankCodeFromIban;
	}
	private static String getAccountNumber(String IBAN) {
		String AccountNumber = IBAN.substring(8, 23);
		return AccountNumber;
	}
	
	private static String getBankName(String IBAN) {
		String Bank = IBAN.substring(4, 8);
		String BankName = null;
		
		if(Bank.equals("6500")) {
			BankName = "365 Bank";
		}
		else if(Bank.equals("8400")) {
			BankName = "Cofidis";
		}
		else if(Bank.equals("8360")) {
			BankName = "Mbank";
		}
		else if(Bank.equals("0720")) {
			BankName = "Národná banka Slovenska";
		}
		else if(Bank.equals("5200")) {
			BankName = "ÈSOB";
		}
		else if(Bank.equals("1100")) {
			BankName = "Tatra banka";
		}
		else if(Bank.equals("8430")) {
			BankName = "KDB Bank Europe";
		}
		else if(Bank.equals("1111")) {
			BankName = "UniCredit Bank ";
		}
		else if(Bank.equals("8120")) {
			BankName = "Privatbanka";
		}
		else if(Bank.equals("8370")) {
			BankName = "Oberbank AG";
		}
		return BankName;
	}
	private static String isIbanValid(String IBAN) {
		String iban = IBAN.substring(0, 2);
		if(iban == ("SK")) {
		
		}
		
		return iban;
		
	}

}
