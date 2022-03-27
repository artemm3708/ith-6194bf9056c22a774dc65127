package ua.ithillel.homework.hw5;

public class Main {

    public static void main(String[] args) {

        Member[] members = getMembers();
        Barrier[] barriers = getBarriers();

        for (Barrier barrier : barriers) {
            for (Member member : members) {
                if (!barrier.overcome(member)) {
                    System.out.println(member.name + " passed out");
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
