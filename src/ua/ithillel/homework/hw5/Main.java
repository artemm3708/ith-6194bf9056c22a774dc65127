package ua.ithillel.homework.hw5;

public class Main {

    public static void main(String[] args) {

        Member[] members = getMembers();
        Barrier[] barriers = getBarriers();

        for (Member member : members) {
            for (Barrier barrier : barriers) {
                if (!barrier.overcome(member)) {
                    System.out.println(member.getName() + " passed out");
                    break;
                }
            }
        }
    }

    public static Member[] getMembers() {
        return new Member[]{new Human(), new Cat(), new Robot()};
    }

    public static Barrier[] getBarriers() {
        return new Barrier[]{new Wall(), new RunningTrack()};
    }
}
