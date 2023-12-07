package november.november18th;


enum Job {
    COP, FIREFIGHTER, DOCTOR, TEACHER;

    public void findJob(Job job) {
        switch (job) {
            case COP:
                System.out.println("경찰관입니다");
                break;
            case FIREFIGHTER:
                System.out.println("소방관입니다");
                break;
            case DOCTOR:
                System.out.println("의사입니다");
                break;
            case TEACHER:
                System.out.println("선생님입니다");
                break;
            default:
                System.out.println("해당 직업을 찾을 수 없습니다");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Job myJob = Job.COP;
        myJob.findJob(myJob);

        TrafficLight theLight = TrafficLight.Yellow;
        theLight.GetTrafficLight();
        theLight.mean();

        for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.getValue());

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));

        for (SeasonMonth month : SeasonMonth.values()) {
            System.out.println(month.name() + " is in " + month.getSeason() + " and has " + month.getDays() + " days.");
        }
    }
}
