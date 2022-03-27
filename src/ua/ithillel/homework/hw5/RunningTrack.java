package ua.ithillel.homework.hw5;

public class RunningTrack extends Barrier {

    private final int length = 50;

    @Override
    public boolean overcome(Member member) {
        if (member.length < this.length) {
            System.out.println(member.name + " can't pass the running track");
            return false;
        } else {
            member.run();
            System.out.println(member.name + " passes the running track on distance " + this.length);
            return true;
        }
    }
}
