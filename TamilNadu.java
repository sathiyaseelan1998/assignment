class TamilNadu extends SouthIndia{

    static String capital="Chennai";

void speakLanguage(){
    System.out.println("tamil");
}

void eat(){
    System.out.println("biryani");
}

void dress(){
    System.out.println("shirts and pants");
}

void cultivate(){
    System.out.println("Rice and Sugar cane cultivate");
}

void livingStyle(){
    System.out.println("Above Average Development");
}
public TamilNadu(){
    super();
}

public static void main(String arg[]){
   
    SouthIndia si=new TamilNadu();
    System.out.println(India.capital);
    System.out.println(TamilNadu.capital);
    si.speakLanguage();
    si.eat();
    si.dress();
    si.cultivate();
    si.livingStyle();

}

}
