package india.newDelhi;

import tamilnadu.chennai.TrafficRulesChennai;
class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai{

public void dontGoByDieselVehicle(){
    System.out.println("Don't use Diesel Vehicle");
}
public void goByDieselVehicle(){
    System.out.println("Diesel Vehicle");
}
public void goByBicycle(){
    System.out.println("Bicycle");
}

public static void main(String arg[]){

    CommonManInDelhi cmd=new CommonManInDelhi();
    //System.out.println(cmd.trafficCommissioner);   //----ambiguty error
    cmd.dontGoByDieselVehicle();
    cmd.goByDieselVehicle();
    cmd.goByBicycle();
}
}
