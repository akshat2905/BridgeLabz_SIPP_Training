package oops;

public class Employes {

    private String name;
    private int id;
    private int salary;

        public Employes(String name,int id,int salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void displayDetails(){
            System.out.println(name);
            System.out.println(id);
            System.out.println(salary);
        }

        public static void main(String[] args){
            Employes emp = new Employes("Akshat Kumar", 152, 50000000);

            emp.displayDetails();
        }
    
}