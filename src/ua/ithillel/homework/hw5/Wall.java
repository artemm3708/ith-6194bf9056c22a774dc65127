package ua.ithillel.homework.hw5;

public class Wall extends Barrier {

    private final int height = 10;

    @Override
    public boolean overcome(Member member) {
        if (member.height < this.height) {
            System.out.println(member.name + " can't pass the wall");
            return false;
        } else {
            member.jump();
            System.out.println(member.name + " passes the wall on distance " + this.height);
            return true;
        }
    }
}
