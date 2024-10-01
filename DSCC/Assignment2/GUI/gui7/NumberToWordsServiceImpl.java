package gui7;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NumberToWordsServiceImpl extends UnicastRemoteObject implements NumberToWordsService {
    protected NumberToWordsServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String convertNumberToWords(int number) throws RemoteException {
        if (number < 0) {
            return "Negative " + convertNumberToWords(-number);
        }
        if (number == 0) {
            return "Zero";
        }

        String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
            "Eighty", "Ninety"
        };

        StringBuilder words = new StringBuilder();

        if (number >= 1000) {
            words.append(units[number / 1000]).append(" Thousand ");
            number %= 1000;
        }
        if (number >= 100) {
            words.append(units[number / 100]).append(" Hundred ");
            number %= 100;
        }
        if (number >= 20) {
            words.append(tens[number / 10]).append(" ");
            number %= 10;
        }
        if (number > 0) {
            words.append(units[number]).append(" ");
        }

        return words.toString().trim();
    }
}
