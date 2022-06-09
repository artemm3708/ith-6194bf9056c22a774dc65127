package ua.ithillel.homework.hw5;

public class Wall extends Barrier {

    private final int height = 10;

    @Override
    public boolean overcome(Member member) {
        member.jump();
        if (member.getHeight() < this.height) {
            System.out.println(member.getName() + " can't pass the wall");
            return false;
        } else {
            System.out.println(member.getName() + " passes the wall on distance " + this.height);
            return true;
        }
    }
}
