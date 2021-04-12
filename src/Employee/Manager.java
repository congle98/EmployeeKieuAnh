package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static ArrayList<Employee> employees =new ArrayList<Employee>();
    static Scanner scanner = new Scanner(System.in);
    static void addEmployee(){
        boolean menu=true;
        while (menu){
            System.out.println("Mời kiểu  nhân viên \n 1.FullTimeEmployee 2.PartTimeEmployee 3.Exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addFullTimeEmployee();
                    break;
                case 2:
                    addPartTimeEmployee();
                    break;
                case 3:
                    menu=false;
                    break;
            }
        }
    }
    static void menu(){
        while (true){
            System.out.println("Mời nhập chọn lựa \n 1.Thêm nhân viên \n " +
                    "2.Liệt kê nhân viên lương thấp \n 3.Tính lương phải trả cho nhân viên parttime" +
                    " \n 4.Hiển thị danh sách nhân viên \n 5.exit");
            int chooseMenu=scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    getAverageSalary();
                    break;
                case 3:
                    getSalaryAllPartTimeEmployee();
                    break;
                case 4:
                    showList();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }
    static void addFullTimeEmployee(){
        System.out.println("Mời nhập id!!");
        String id = new  Scanner(System.in).nextLine();
        System.out.println("Mời nhập tên!!");
        String name = new  Scanner(System.in).nextLine();
        System.out.println("Mời nhập tuổi!!");
        int age = scanner.nextInt();
        System.out.println("Mời nhập số điện thoại");
        int phoneNumber = scanner.nextInt();
        System.out.println("Mời nhập email!!");
        String email = new  Scanner(System.in).nextLine();
        System.out.println("Mời nhập tiền thưởng");
        double reward = scanner.nextDouble();
        System.out.println("Mời nhập tiền phạt");
        double punish = scanner.nextDouble();
        System.out.println("Mời nhập lương cứng");
        double salaryBasic = scanner.nextDouble();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id,name,age,phoneNumber,email,reward,punish,salaryBasic);
        employees.add(fullTimeEmployee);
    }
    static void addPartTimeEmployee(){
        System.out.println("Mời nhập id!!");
        String id = scanner.next();
        System.out.println("Mời nhập tên!!");
        String name = scanner.next();
        System.out.println("Mời nhập tuổi!!");
        int age = scanner.nextInt();
        System.out.println("Mời nhập số điện thoại");
        int phoneNumber = scanner.nextInt();
        System.out.println("Mời nhập email!!");
        String email = scanner.next();
        System.out.println("Mời nhập thời gian làm việc");
        double workingTime = scanner.nextDouble();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id,name,age,phoneNumber,email,workingTime);
        employees.add(partTimeEmployee);
    }
    static void getAverageSalary(){
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum+=employees.get(i).getSalary();
        }
        double averageSalary=sum/employees.size();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary()<averageSalary&&employees.get(i) instanceof FullTimeEmployee){
                System.out.println(employees.get(i).getName());
            }
        }
    }
    static void getSalaryAllPartTimeEmployee(){
        double Salary=0;
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i) instanceof PartTimeEmployee){
                Salary+=employees.get(i).getSalary();
            }
        }
        System.out.println(Salary);
    }
    static void showList(){
        for (int i = 0; i < employees.size() ; i++) {
            System.out.println("Nhân viên thứ "+i+" là: \n"+employees.get(i));
        }
    }
}
