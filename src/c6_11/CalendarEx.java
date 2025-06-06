package c6_11;

import java.util.Calendar;

// CalendarEx.java
public class CalendarEx {
    // Calendar 객체의 정보를 형식에 맞춰 출력하는 메소드
    public static void printCalendar(String msg, Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // MONTH는 0부터 시작하므로 1을 더함
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1(일요일)~7(토요일)
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시간 기준
        int ampm = cal.get(Calendar.AM_PM); // 0(오전), 1(오후)
        int hour = cal.get(Calendar.HOUR); // 12시간 기준
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);

        System.out.print(msg + year + "/" + month + "/" + day + "/");
        switch (dayOfWeek) {
            case Calendar.SUNDAY: System.out.print("일요일"); break;
            case Calendar.MONDAY: System.out.print("월요일"); break;
            case Calendar.TUESDAY: System.out.print("화요일"); break;
            case Calendar.WEDNESDAY: System.out.print("수요일"); break;
            case Calendar.THURSDAY: System.out.print("목요일"); break;
            case Calendar.FRIDAY: System.out.print("금요일"); break;
            case Calendar.SATURDAY: System.out.print("토요일"); break;
        }
        System.out.print("(" + hourOfDay + "시) ");
        if (ampm == Calendar.AM) System.out.print("오전");
        else System.out.print("오후");
        System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
    }

    public static void main(String[] args) {
        // 현재 날짜와 시간 정보로 Calendar 객체 생성
        Calendar now = Calendar.getInstance();
        printCalendar("현재 ", now);

        // 특정 날짜와 시간 정보로 Calendar 객체 설정
        Calendar firstDate = Calendar.getInstance();
        firstDate.clear(); // 현재 시간 정보 삭제
        // 2016년 12월 25일 설정 (월은 0부터 시작하므로 11로 설정)
        firstDate.set(2016, 11, 25);
        firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시 (20시)
        firstDate.set(Calendar.MINUTE, 30);      // 30분
        printCalendar("처음 데이트한 날은 ", firstDate);
    }
}

// 현재 2025/6/7/토요일(0시) 오전0시 43분 18초 157밀리초
// 처음 데이트한 날은 2016/12/25/일요일(20시) 오후8시 30분 0초 0밀리초