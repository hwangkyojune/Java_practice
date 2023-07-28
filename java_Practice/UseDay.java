public class UseDay {
    public static void main(String[] args) {
        Day day1 = Day.SUNDAY;
        Day day2 = Day.SATURDAY;


        System.out.println(Day.class);

        if(day1 == Day.SUNDAY){
            System.out.println("맞아요 일요일 이에요.");
        }
        switch (day2){
            case SUNDAY:System.out.println("일요일");
            case SATURDAY:System.out.println("토요일");
        }
    }
}
