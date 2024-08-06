package july.ju31;

import java.util.*;
import java.time.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> carHours = new TreeMap<>();
        Map<String,LocalTime> enterCar = new HashMap<>();
        Map<String,Boolean> inCar = new HashMap<>();
        int basicHour = fees[0];
        int basicFee = fees[1];
        int overTime = fees[2];
        int overFee = fees[3];

        for(int i=0;i<records.length;i++){
            String curTime = records[i].substring(0,5);
            String curHours = records[i].substring(0,2);
            String curMin = records[i].substring(3,5);
            String carNum = records[i].substring(6,10);
            String inOut = records[i].substring(11,13);

            LocalTime lCurTime = LocalTime.of(Integer.parseInt(curHours),Integer.parseInt(curMin));

            if(inOut.equals("IN")){
                enterCar.put(carNum,lCurTime);
                inCar.put(carNum,true);
            }
            else {
                LocalTime preTime = enterCar.get(carNum);
                Duration duration = Duration.between(preTime, lCurTime);
                inCar.put(carNum,false);

                long hours =  duration.toHours();
                long minutes =  duration.toMinutes();
                System.out.println("minutes = " + minutes);
                long sumTime =  minutes;

                carHours.put(carNum,carHours.getOrDefault(carNum,0) + (int)sumTime);
            }

        }

        for(Map.Entry<String,Boolean> entry : inCar.entrySet()){
            if(entry.getValue()){
                LocalTime preTime = enterCar.get(entry.getKey());
                LocalTime endTime = LocalTime.of(23 ,59);
                Duration duration = Duration.between(preTime,endTime);

                long hours =  duration.toHours();
                long minutes =  duration.toMinutes();
                System.out.println("minutes = " + minutes);
                long sumTime =  minutes;

                carHours.put(entry.getKey(),carHours.getOrDefault(entry.getKey(),0)+(int)sumTime);
            }
        }

        for(Map.Entry<String,Integer> entry : carHours.entrySet()){
            int nowTime = entry.getValue();

            if(nowTime <= basicHour){
                list.add(basicFee);
            }
            else {

                int fee = ((int)Math.ceil(nowTime - basicHour) / overTime)  * overFee + basicFee;
                if(nowTime % overTime > 0) fee += overFee;
                list.add(fee);

            }
        }
        answer = new int[list.size()];

        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int fee[] = new int[]{180, 5000, 10, 600};
        String[] records = new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        for(int x : T.solution(fee,records)) {
            System.out.println("x = " + x);
        }
//        LocalDate birthdate = LocalDate.of(1995, Month.MAY,4);
//        System.out.println("birthdate = " + birthdate);
//
//        LocalTime bedTime = LocalTime.of(05,30);
//        System.out.println("bedTime = " + bedTime);
//
//        LocalTime morning = LocalTime.of(7,30);
//        System.out.println("morning = " + morning);
//
//        Duration newD = Duration.between(bedTime, morning);
//        System.out.println("newD = " + newD);
//        long hours = newD.toHours();
//        long minutes = newD.toMinutes();
//        System.out.println("ㅅ시간 차이 = "+hours+"minutes = " + minutes);
//
//        LocalDateTime  meeting = LocalDateTime.of(2024,7,29,10,0);
//        System.out.println("meeting = " + meeting);
//
//
//        Instant now = Instant.now();
//        System.out.println("now = " + now);
//
//        Duration two = Duration.ofHours(2);
//        System.out.println("two = " + two);
//
//        Period twodays = Period.ofDays(10);
//        System.out.println("twodays = " + twodays);
    }
}