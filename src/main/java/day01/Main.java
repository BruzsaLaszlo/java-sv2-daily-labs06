package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PositiveNumberContainer pnc = new PositiveNumberContainer();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Kérek egy számot: ");
            double d = sc.nextDouble();
            sc.nextLine();

            if (d > 0)
                pnc.add(d);
            else {
                System.out.println(pnc.getList());
                break;
            }

        }

    }

}
