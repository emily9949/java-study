package section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {


        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다 */
        /* 설명.
         *   Date 형 대비 개선점
         *   1. Timezone과 관련된 기능이 추가되었다.
         *   2. 윤년 관련 기능이 내부적으로 추가되었다.
         *   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드명을 줄였다.
         * */

        // Calender 는 protected 생성자를 가지고 있어서 객체 생성을 바로 못함
        Calendar calendar = Calendar.getInstance(); // getInstance 메소드를 통해 객체 생성
        System.out.println("calendar = " + calendar);

        Calendar calendar2 = new GregorianCalendar();
        System.out.println("calendar2 = " + calendar2);

        int year = 1987;
        int month = 9 - 1;
        int dayOfMonth = 15;
        int hour = 17;
        int min = 30;
        int second = 59;

        Calendar birthday = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthday = " + birthday);

        System.out.println("태어난 해: " + birthday.get(Calendar.YEAR)); // Calendar 는 static 영역에 존재하기 때문에 .YEAR로 값을 가져오면 된다
        System.out.println("태어난 해: " + birthday.get(1)); // 1이랑 Calendar.YEAR는 같음. 1은 YEAR를 의미
        System.out.println("태어난 월: " + birthday.get(Calendar.MONTH));
        System.out.println("태어난 일: " + birthday.get(Calendar.DAY_OF_MONTH));

        String day = "";
        int dayNum = birthday.get(Calendar.DAY_OF_WEEK);
        switch (dayNum) {
            case Calendar.SUNDAY: day = "일"; break;
            case 2: day = "월"; break;
            case 3: day = "화"; break;
            case 4: day = "수"; break;
            case 5: day = "목"; break;
            case 6: day = "금"; break;
            case 7: day = "토"; break;

        }

        System.out.println("내가 태어난 요일은 " + day + "요일이야~");

        System.out.println("AM/PM = " + birthday.get(Calendar.AM_PM)); // 0은 오전, 1은 오후
        System.out.println("hourOfDay = " + birthday.get(Calendar.HOUR_OF_DAY)); // 24시간 체계
        System.out.println("hour: " + birthday.get(Calendar.HOUR));

        /* 설명. SimpleDateFormat 활용 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthday.getTimeInMillis()));
        System.out.println("birthDayString = " + birthDayString);

    }

}
