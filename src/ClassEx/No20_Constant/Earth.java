package ClassEx.No20_Constant;

/*
 상수 선언, 상수는 static이면서 final이어야 한다.
 static final 필드는 객체마다 저장되지 않고, 클래스에만 포함된다. 그리고 한 번 초기값이 저장되면 하면 변경할 수 없다.
 static final 타입 상수 [= 초기값];
 초기값이 단순 값이라면 선언 시에 주는 것이 일반적이지만, 복잡한 초기화일 경우 정적 블록에서도 할 수 있다.
 static final 타입 상수; static { 상수=초기값; }
 */

public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
