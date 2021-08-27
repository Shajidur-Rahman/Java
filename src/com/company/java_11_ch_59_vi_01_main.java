package com.company;

interface camera2{
    void takePic();
    void recoedVideo();
    default void record4k(){
        System.out.println("Recording...");
    }
}

interface wifi2{
    String[] getNetwork();
    void connectToNetwork(String name);
}

class cellPhone2{
    int callNumber(int number){
        System.out.println("Calling ..." + number);
        return number;
    }
    void picCall(){
        System.out.println("connecting ...");
    }
}

class mySmartPhone2 extends cellPhone implements camera2, wifi2{
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


public class java_11_ch_59_vi_01_main {
    public static void main(String[] args) {
        camera2 cam = new mySmartPhone2();

    }
}
