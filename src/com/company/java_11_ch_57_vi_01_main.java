package com.company;

interface camera{
    void takePic();
    void recoedVideo();
    default void record4k(){
        System.out.println("Recording...");
    }
}

interface wifi{
    String[] getNetwork();
    void connectToNetwork(String name);
}

class cellPhone{
    int callNumber(int number){
        System.out.println("Calling ..." + number);
        return number;
    }
    void picCall(){
        System.out.println("connecting ...");
    }
}

class mySmartPhone extends cellPhone implements camera, wifi{
    public void takePic(){
        System.out.println("Taking pic");
    }
    public void recoedVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Networking...");
        String [] name = {"Shajidur","Rahman"};
        return name;
    }
    public void connectToNetwork(String name){
        System.out.println("netish");
    }
}

public class java_11_ch_57_vi_01_main {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String [] arr = ms.getNetwork();
        for (String element:
             arr) {
            System.out.println(element);
        }
    }
}
