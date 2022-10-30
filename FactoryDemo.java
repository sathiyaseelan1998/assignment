abstract class FactorDemo extends SmartPhone{

boolean isOriginalPiece=false;
static int price=0;

abstract void verifyFingerPrint();

abstract void providePattern();

int call(int seconds){
    
    return seconds;
}
void sendMessage(){
    System.out.println("Send the Message");
}

void receiveCall(){
    System.out.println("Call Received");
}

void browse(){
        System.out.println("FactoryDemo browsing");
}

}
