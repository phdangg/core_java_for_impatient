package Chapter2;

public class Employee implements Measurable{
    private double salary;
    Employee(){
        this.salary = 0;
    }
    Employee(double salary){
        this.salary = salary;
    }
    public double getMeasure(){
        return this.salary;
    }
    public double average(Measurable[] objects){
        if (objects.length ==0) return 0;
        double sum = 0;
        for (Measurable obj : objects){
            sum+=obj.getMeasure();
        }
        double avg = sum / objects.length;
        return avg;
    }
}
