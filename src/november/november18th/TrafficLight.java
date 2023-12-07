package november.november18th;

public enum TrafficLight {
    RED("Stop") {
        @Override
        public void mean() {
            System.out.println("멈추세요!");
        }
    },
    GREEN("Go") {
        @Override
        public void mean() {
            System.out.println("가세요!");
        }
    },

    Yellow("SlowDown") {
        @Override
        public void mean() {
            System.out.println("속도를 낮추세요!");
        }
    };
    private String trafficLight;

    protected abstract void mean();

    TrafficLight(String light) {
        this.trafficLight = light;
    }

    public String GetTrafficLight() {
        return trafficLight;
    }
}
