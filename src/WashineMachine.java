public class WashineMachine {
    static float mikos = 100;
    static float vathos = 50;
    static float ipsos = 150;
    static String manufacturername = " Samsung : ";
    static String devicename = " WW90T504DAX/S7: ";
    static String devicetype = " WashineMachine: ";
    static String energyconsumption = " 1A+";

    static void setMikos(float x) {
        mikos = x;
    }
    static void setVathos(float y) {
        mikos = y;
    }
    static void setIpsos(float z) {
        mikos = z;
    }
    static void setManufacturername(int a) {
        manufacturername = String.valueOf(a);
    }
    static void setDevicename(int b) {
        manufacturername = String.valueOf(b);
    }
    static void setDevicetype(int c) {
        manufacturername = String.valueOf(c);
    }
    static void setEnergyconsumption(int d) {
        manufacturername = String.valueOf(d);
    }


    public static void main(String[] args) {
        if (mikos !=100) {
            System.out.println("ERROR");
        } else {
            System.out.println("To mikos einai:" + mikos);
        }
        if (vathos !=50) {
            System.out.println("ERROR");
        } else {
            System.out.println("To vathos einai:" + vathos);
        }
        if (ipsos !=150) {
            System.out.println("ERROR");
        } else {
            System.out.println("To ipsos einai:" + ipsos);
        }
        if(manufacturername == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("To onoma toy kataskevasti einai:" + manufacturername);
        }
        if(devicename == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("To onoma tis siskeuis einai:" + devicename);
        }
        if(devicetype == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("O typos tis siskeuis einai:" + devicetype);
        }
        if(energyconsumption == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("H katanalosi energeias einai:" + energyconsumption);
        }
    }
}