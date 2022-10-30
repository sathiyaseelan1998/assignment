class Trainer{

String dept="Java";
String institute="Payilagam";
private int salary=10000;
Trainer(){
    System.out.println("Trainer Constructor");
}
Trainer(String dept,String institute){

    this.dept=dept;
    this.institute=institute;
}

int getSalary(){
    return salary;
}

void training(){
    System.out.println(this.dept);
    System.out.println(this.institute);
}

}
