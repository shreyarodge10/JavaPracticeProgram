class Employee{
    private String;
    public void setName(String name){
       this.name=name; 
    }
    public String getName(){
        return name;
    }
}
class person extends Employee{
    private double salary;
    public void setsalary(double salary){
        this.salary=salary;

    }
    public double getsalary(){
        return salary;
    }
}
class Manager extends person{
    class Manager extends Employee{
        private String teamName;
        public void set teamName(String teamName){
            this.teamName=teamName;
        }
        public String getteamName(){
            return teamName();
        }
    }
}















}




