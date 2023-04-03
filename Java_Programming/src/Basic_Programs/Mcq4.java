package Basic_Programs;

public class Mcq4 {
    public static void main(String[] args) {
        int dailywage = 4;
        int number_of_days = 5;
        int salary = number_of_days++ * --
dailywage * dailywage++ * number_of_days--;
        //salary =- dailywage;//Wrong Compound Assignment
        salary -= dailywage;//Correct compound Assignment
        System.out.println(dailywage + " " + number_of_days + " " + salary);
    }

}
