class Mobile extends Telephone{

int price=15000;
String name="Mobile";
public void sms(){
    System.out.println("Messaging Facility");
}
public static void main(String args[]){

    Mobile samsung=new Mobile();
    System.out.println("Mobile Price: "+samsung.price);
    System.out.println("Name: "+samsung.name);
    samsung.sms();
    samsung.call();
    samsung.receive_call();

    Telephone bsnl=new Telephone();
    System.out.println("Telephone Price: "+bsnl.price);
    System.out.println("Name: "+bsnl.name);
    bsnl.call();
    bsnl.receive_call();

}

}
