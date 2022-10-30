abstract class FactorDemo extends SmartPhone{

boolean isOriginalPiece=false;
static int price=0;

abstract void verifyFingerPrint();

abstract void providePattern();

void browse(){
        System.out.println("FactoryDemo browsing");
}

}
