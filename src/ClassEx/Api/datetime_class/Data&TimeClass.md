# 날짜와 시간 클래스(Date & Calendar)

Date - 날짜 정보를 전달하기 위해 사용
Calendar - 다양한 시간대별로 날짜와 시간을 얻을 때 사용
LocalDateTime - 날짜와 시간을 조작할 때 사용.

■Date
Date now = new Date();

■Calendar
Calendar now = Calendar.getInstance(); // Calendar 클래스는 추상클래스이다. new로 객체 생성을 할 수 없다.

Calendar가 제공하는 날짜와 시간에 대한 정보를 얻기 위해서는 get() 메서드를 이용한다.
get() 메서드의 매개값으로 Calendar에 정의된 상수를 주면 상수가 의미하는 값을 리턴한다.

int year     = now.get(Calendar.YEAR);             // 년도를 리턴
int month    = now.get(Calendar.MONTH) + 1;        // 월을 리턴
int day      = now.get(Calendar.DAY_OF_MONTH);     // 일을 리턴
int week     = now.get(Calendar.DAY_OF_WEEK);             // 요일을 리턴
int amPm     = now.get(Calendar.AM_PM);            // 오전/오후를 리턴
int hour     = now.get(Calendar.HOUR);             // 시를 리턴
int minute   = now.get(Calendar.MINUTE);           // 분을 리턴
int second   = now.get(Calendar.SECOND);           // 초를 리턴


■시간 날짜 조작
[Java 날짜/시간 API 주요 계산 메서드 정리]

* 빼기 메서드 (minus 계열)
    - minusYears(long) : 년 빼기
    - minusMonths(long) : 월 빼기
    - minusDays(long) : 일 빼기
    - minusWeeks(long) : 주 빼기
    - minusHours(long) : 시간 빼기
    - minusMinutes(long) : 분 빼기
    - minusSeconds(long) : 초 빼기
    - minusNanos(long) : 나노초 빼기

* 더하기 메서드 (plus 계열)
    - plusYears(long) : 년 더하기
    - plusMonths(long) : 월 더하기
    - plusWeeks(long) : 주 더하기
    - plusDays(long) : 일 더하기
    - plusHours(long) : 시간 더하기
    - plusMinutes(long) : 분 더하기
    - plusSeconds(long) : 초 더하기

`LocalDateTime` 클래스를 이용해서 현재 컴퓨터의 날짜와 시간을 얻는 방법

LocalDatetime now = LocalDateTime.now();


■날짜와 시간 비교

LocalDateTime 클래스는 날짜와 시간을 비교할 수 있는 메서드를 제공한다.

[Java 날짜/시간 API 비교 및 차이 계산 메서드]

* 리턴 타입: boolean
    - isAfter(other): 이후 날짜인지 확인
    - isBefore(other): 이전 날짜인지 확인
    - isEqual(other): 동일 날짜인지 확인

* 리턴 타입: long
    - until(other, unit): 지정한 단위(unit) 차이를 리턴