package lab5prob;

public class employee {
    private int empNum;
    private String name;
    private String email;
    private float hourRate;
    private float capacity;
    private int freeDays;

    public employee(String name,String email,float hourRate,float capacity,int freeDays){
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    private void setName(String empname){
        name = empname;
    }
    public String getName(){
        return name;
    }
    private void setEmail(String empemail){
        email = empemail;
    }
    private String getEmail(){
        return email;
    }
    private void setHourRate(float hourr8){
        hourRate = hourr8;
    }
    private float getHourRate(){
        return hourRate;
    }
    private void setCapacity(float cap)
    {
        capacity=cap;
    }
    private float getCapacity(){
        return capacity;
    }
    private void setFreeDays(int days){
        freeDays=days;
    }
    private int getFreeDays(){
        return freeDays;
    }
    public double getDailyIncome(){
        return hourRate * capacity;
    }
    public double getMonthlyIncome(){
        double dailyIncome = getDailyIncome();
        double removeIncome = freeDays * dailyIncome;
        return dailyIncome * 30-removeIncome;
    }
}