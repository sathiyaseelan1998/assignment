class ActorSivaKumar implements Actor{

static String address="Coimbatore";

public void act(){

    System.out.println("Acting method");
}

public void dance(){

    System.out.println("Dancing method");
}

public void sing(){

    System.out.println("Singing method");
}
void speaking(){

    System.out.println("Speaking method");
}
ActorSivaKumar(){
    System.out.println("ActorSivaKumar Constractor");
}

ActorSivaKumar(int age,String car){
    System.out.println("Age :"+age);
    System.out.println("Car :"+car);
}
public static void main(String arg[]){

ActorSivaKumar as=new ActorSivaKumar(65,"Audi car");
    as.act();
    as.dance();
    as.sing();
    as.speaking();
    System.out.println(address);
Actor ac=new ActorSivaKumar();
    ac.act();
    ac.dance();
    ac.sing();
   // ac.speaking(); can't access parent reference of object
    System.out.println(ac.address);
}
}
