class Samsung extends FactorDemo{

static int price=5000;


void verifyFingerPrint(){
    System.out.println("Finger Print Varified");
}

void providePattern(){
    System.out.println("Pattern Lock");
}
public static void main(String arg[]){
    Samsung sam=new Samsung();
    sam.browse();
    System.out.println(sam.price);
    sam.verifyFingerPrint();
    sam.providePattern();
    System.out.println(sam.call(10)+" seconds");
    sam.sendMessage();
    sam.receiveCall();
}
}
