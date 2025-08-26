public class Salary {
    public static void main(String[] args) {
        int fistWorker = 3000;
        int secondWorker = 4500;
        int thirdWorker = 5800;
        int tax = 5;
        System.out.println("Salary of First worker for 10 years: " + SalaryTenYears(fistWorker) + " $");
        System.out.println("Salary of Second worker for 10 years: " + SalaryTenYears(secondWorker) + " $");
        System.out.println("Salary of Third worker for 10 years: " + SalaryTenYears(thirdWorker) + " $");
        System.out.println(" ");
        System.out.println("Net salary of First worker for 10 years: " + Tax(SalaryTenYears(fistWorker), tax) + " $");
        System.out.println("Net salary of Second worker for 10 years: " + Tax(SalaryTenYears(secondWorker), tax) + " $");
        System.out.println("Net salary of Third worker for 10 years: " + Tax(SalaryTenYears(thirdWorker), tax) + " $");
        System.out.println(" ");
        System.out.println("Average net salary of all worker for 10 years: " + AVR(Tax(SalaryTenYears(fistWorker), tax),
                Tax(SalaryTenYears(secondWorker), tax),Tax(SalaryTenYears(thirdWorker), tax)) + " $");
    }
    public static int SalaryTenYears(int i){
        return (i*120);
    }
    public static int Tax(int salary,int tax){
        int netPay = (salary/100)*(100-tax);
        return (netPay);
    }
    public static int AVR(int netPayFirst,int netPaySecond, int netPayThird){
        int avrNetPay = (netPayFirst + netPaySecond + netPayThird)/3;
        return avrNetPay;
    }
}
