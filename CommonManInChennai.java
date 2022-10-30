package tamilnadu.chennai;

class CommonManInChennai implements TrafficRulesChennai{

public void goByDieselVehicle(){
    System.out.println("Diesel Vehicle");
}

public void goByBicycle(){
    System.out.println("Bicycle");
}

public static void main(String arg[]){

    CommonManInChennai cmc=new CommonManInChennai();
    System.out.println(cmc.trafficCommissioner);
    cmc.goByDieselVehicle();
    cmc.goByBicycle();
}
}
