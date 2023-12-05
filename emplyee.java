 class emp{
    int salary;
    String name;
    public void getsalary(){
        System.out.println(salary);
    }
    public void getname(){
        System.out.println(name);
    }
    public void setname(String n)
        {
            name=n;
        }

 }
 
 
 
 
 public class emplyee {
    public static void main(String[] args) 
    {
      emp obj =new emp();
      obj.salary=455;
      obj.setname("atharv");  
      obj.getsalary();
      obj.getname();
    }
 }
