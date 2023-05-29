package du_vaccine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        boolean end = false;
        while (true) {
            string = scanner.nextLine();
            string = string.substring(0, 1);
            string = string.toUpperCase();

            switch (string) {
                case "P": {
                    Vaccine.PFIZER.num++;
                    break;
                }
                case "A": {
                    Vaccine.ASTRA_ZENECA.num++;
                    break;
                }
                case "J": {
                    Vaccine.JANSSEN.num++;
                    break;
                }
                case "M": {
                    Vaccine.MODERNA.num++;
                    break;
                }
                case "N": {
                    Vaccine.NOVAVAX.num++;
                    break;
                }
                default: {
                    end = true;
                    break;
                }
            }
            if (end == true) {
                break;
            }
        }

        end = false;

        System.out.println();

        while (true) {
            string = scanner.nextLine();
            string = string.substring(0, 1);
            string = string.toUpperCase();

            switch (string) {
                case "P": {
                    System.out.println(Vaccine.PFIZER.num);
                    break;
                }
                case "A": {
                    System.out.println(Vaccine.ASTRA_ZENECA.num);
                    break;
                }
                case "J": {
                    System.out.println(Vaccine.JANSSEN.num);
                    break;
                }
                case "M": {
                    System.out.println(Vaccine.MODERNA.num);
                    break;
                }
                case "N": {
                    System.out.println(Vaccine.NOVAVAX.num);
                    break;
                }
                default: {
                    end = true;
                    break;
                }
            }
            if (end == true) {
                break;
            }
        }
    }

    public enum Vaccine {
        PFIZER(0),
        MODERNA(0),
        ASTRA_ZENECA(0),
        NOVAVAX(0),
        JANSSEN(0);

        public int num;

        private Vaccine(int num) {
            this.num = num;
        }
    }

}
//1.
//2.nie netreba,ale neni to az take zle
//3.ano je rozsiritelne