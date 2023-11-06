package lab5prob;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class lab5 {
    public static void main (String[] args){
        List<employee> angajati = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate angajati avem?");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++)
        {
            scanner.nextLine();
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("email: ");
            String email = scanner.nextLine();
            System.out.println("hourRate: ");
            float hourrate = scanner.nextFloat();
            System.out.println("capacity: ");
            float capacity = scanner.nextFloat();
            System.out.println("freedays: ");
            int freedays = scanner.nextInt();

            employee newemployee = new employee(name,email,hourrate,capacity,freedays);
            angajati.add(newemployee);
        }

        for (employee e:angajati){
            double employeeIncome = e.getMonthlyIncome();
            double dailyIncome = e.getDailyIncome();
            System.out.println(e.getName()+" "+e.getMonthlyIncome());
    }

    }
}
