package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
       // (String name, String contents, String discType)
        DVD disc1 = new DVD("Jones Blues", "Music","DVD", 16111);
        CD disc2 = new CD("DOS III", "Code","CD", true);



        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(disc1);
        disc1.spinDisc();
        disc1.erase();
        System.out.println(disc1);

        System.out.println(disc2);
        disc2.spinDisc();
        disc2.clean();
        System.out.println(disc2);


    }
}
