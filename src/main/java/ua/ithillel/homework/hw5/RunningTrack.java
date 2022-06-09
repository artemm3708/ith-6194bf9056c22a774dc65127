package ua.ithillel.homework.hw5;

public class RunningTrack extends Barrier {

    private final int length = 50;

    @Override
    public boolean overcome(Member member) {
        member.run();
        if (member.getLength() < this.length) {
            System.out.println(member.getName() + " can't pass the running track");
            return false;
        } else {
            System.out.println(member.getName() + " passes the running track on distance " + this.length);
            return true;
        }
    }
}
