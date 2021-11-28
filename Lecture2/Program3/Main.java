package Lecture2.Program3;

public class Main {
    public static void main(String[] args) {
        Phone []phon = new Phone[3];
        phon[0]=new Phone();
        phon[1]=new Phone("+722331","Xiaomi");
        phon[2]=new Phone("+78005553535","AFD", 111);
        for(Phone i : phon ){
            System.out.println(i.number + " " + i.model + " " + i.weight);
            i.receiveCall("Adolf");
            i.receiveCall("Maksim","+123131312");
            System.out.println(i.getNumber());
            i.sendMessage("+131313","+1412434321","+558484549", "+1613624");
            System.out.println();
        }
    }
}
