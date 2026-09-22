# Object - 객체 비교(equals())

▶ 기본적으로 == 연산자와 동일한 결과를 리턴(번지 비교)

▶ 논리적 동등을 위해 오버라이딩 필요
 ● 논리적 동등 = 같은 객체이건 다른 객체이건 상관없이 객체가 저장하고 있는 데이터가 동일
 ● Object의 equals() 메서드는 직접 사용되기 보다는 재정의하여 논리적 동등을 비교할 때 사용.
    예) String 클래스는 equals()를 재정의해서 String 객체간에 문자열을 비교한다.



# Object - 객체 해시코드(hashCode())

▶ 객체의 해시코드란
 ● 객체를 식별할 하나의 정수값을 의미
 ● Object의 hashCode() 메서드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴
   ✔ 따라서 개별 객체는 해시코드가 모두 다르다.


▶ 논리적 동등 비교시 hashCode() 오버라이딩의 필요성
 ● 컬렉션 프레임워크의 HashSet, HashMap, Hashtable과 같은 클래스는 두 객체가 동등한 객체인지 판단함.
 ● 따라서 논리적 동등 객체는 hashCode()가 리턴하는 값도 같아야 됨.

　[ hashCode() 리턴값 ]
　│
　├── (다름) ──────────────────────► ( 다른 객체 )
　│
　│ (같음)
　▼
　[ equals() 리턴값 ]
　│
　├── (true) ──────────────────────► ( 동등 객체 )
　│
　└── (false) ─────────────────────► ( 다른 객체 )



# Object - 객체 문자정보(toString())

▶ 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
▶ Object 클래스의 toString() 메서드는 객체의 문자 정보를 리턴한다. 
 ● Object 클래스의 toString() 메서드는 "클래스명@해시코드"로 구성된 문자 정보를 리턴

 Object obj = new Object();
 System.out.println( obj.toString() );
 
【실행 결과】
java.lang.Object@XXXXXX(해시코드)

▶ 일반적으로 `재정의해서 의미있는 문자정보가 나오도록 재정의`한다.
 ● Date 클래스는 toString() 메서드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴
 ● String 클래스는 toString() 메서드를 재정의해서 저장하고 있는 문자열을 리턴

▶ System.out.println(Object) 메서드는 Object의 toString()의 리턴값을 출력한다.


# Object - 객체 복제(clone())

▶ 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것을 말한다.

▶ 복제 종류
 ● 얕은 복제(`thin clone`): 단순히 `필드 값만 복제`(참조 타입 필드는 번지 공유) 
 ● 깊은 복제(`deep clone`): 참조하고 있는 `객체도 복제`  

▶ Object의 clone() 메서드는 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
 ● java.lang.Cloneable `인터페이스를 구현한 객체만 복제 가능`하다.
   ✔ `구현하지 않을 경우` clone()을 호출하면 `CloneNotSupportedException 예외 발생`!!

▶ 깊은 복제를 하려면 clone() 메서드를 재정의하고 참조 객체도 복제해야 한다.


# Object - 객체 소멸자(finalize())

▶ GC는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
▶ Object의 finalize()는 기본적으로 실행 내용이 없다.
▶ 객체가 소멸되기 전에 실행할 코드가 있다면 Object의 finalize()를 재정의한다.

@Override
protected void finalize() throws Throwable {
    System.out.println(no + "번 객체의 finalize()가 실행됨");
}

▶ 될수 있다면 소멸자를 사용하지 않는 것이 좋다.
 ● GC는 메모리의 모든 쓰레기 객체를 소멸하지 않는다.
   ✔ 메모리의 상태를 보고 일부만 소멸시킨다. 
   ✔ 따라서 남아 있는 객체는 finalize() 메서드가 호출되지 않는다.

 ● 또한 GC의 구동 시점이 일정하지 않다.
   ✔ 메모리가 부족할 때 그리고 CPU가 한가할 때에 JVM에 의해서 자동 실행.