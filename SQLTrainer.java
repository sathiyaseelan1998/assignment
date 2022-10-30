class SQLTrainer extends Trainer{

public static void main(String arg[]){

    Trainer trainerKumar=new Trainer("CSE","Payilagam");
    SQLTrainer ram=new SQLTrainer();
    System.out.println(ram.dept);
    System.out.println(ram.institute);
    System.out.println(ram.getSalary());
    trainerKumar.training();
}
}
