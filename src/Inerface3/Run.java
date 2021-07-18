package Inerface3;

public class Run {
    public static void main (String[] args){
        IStart iStart = new ICosmodrome();
        Сosmodrome cosmodrome =  new Сosmodrome();
        cosmodrome.Launch(iStart);

        System.out.println("**********");

        IStart shuttleStart = new Shuttle();
        Shuttle shuttle = new Shuttle();
        shuttle.LaunchShuttle(shuttleStart);
    }
}
