package org.example;

/**
 * create an application based on the following requirements
 * All Phones offer the following behavior:
 *
 * you can create new contacts (as separate properties - create 2 contacts per phone)
 * you can see existing contacts
 * you can send a text message
 * you can see all messages for a specific contact (as separate properties - create 2 messages per contact)
 * you can make a call
 * you can see all calls history
 * Implement a hierarchy of Phone classes where:
 *
 * a Phone can be of certain manufacturers and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
 * properties which cannot change: battery life (in number of hours)
 * properties that are configurable: color, material
 * properties that are instance specific: IMEI
 * Behavior
 *
 * a message can have maximum 500 chars
 * every time a message is send an hour is taken from the battery life
 * every time a call is made two hours are taken from the battery life
 *
 *
 * API (Application Programming Interface)
 *
 * Phone phone= new Samsung(); // shouldn't compile
 *
 * Phone phone = new SamsungGalaxy6();
 *
 * phone.addContact("1", "phone number", "first name", "last name");
 *
 * phone.addContact("2", "second phone number", "second first name", "second last name");
 *
 * phone.getFirstContact();
 *
 * phone.getLastContact();
 *
 * // send a message to the first contact from the previously listed
 *
 * // max number of characters - 100
 *
 * phone.sendMessage("phone number", "message content");
 *
 * phone.getFirstMessage("phone number");
 *
 * phone.getSecondMessage("phone number");
 *
 * // make a call to the second contact from the previously listed
 *
 * phone.call("second phone number");
 *
 * phone.viewHistory();
 *
 * Tasks
 *
 * implement the classes, abstract classes and interfaces according to the given information
 * create at least 2 phone brands with 2 models for each
 * create 2 new contacts
 * send a message to the first contact
 * make a call to the second contact
 *
 */
public class App 
{
    public static void main(String[] args) {

        //Phone phone= new Huawei phone()
        Phone huawei = new HuaweiP40Lite ("8615360301196");

        huawei.addContact(1, "0742453672", "Costel", "Popescu");
        huawei.addContact(2, "0711554878", "Ionel", "Ionescu");
        huawei.listContacts();

       // send a message from the first contact
       // SMS maximum number of characters - 500

        huawei.sendMessage("0742453672", ": Where are you? " + "\n");
        huawei.listMessages("0742453672");


       // respond to the message from the second contact

        huawei.sendMessage("0711554878", ": Look out your window x(" + "\n");



        huawei.setColor("black");
        System.out.println("Phone color is " + huawei.getColor());

        System.out.println("Current battery level " + huawei.getCurrentBatteryLevel());


        huawei.viewHistory();
        huawei.call("0778558745");
        huawei.call("0728556475");
        huawei.call("0765022010");
        huawei.call("0744020058");



    }

}
