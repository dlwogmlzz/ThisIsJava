# 수학 클래스

[Java Math 클래스 주요 메서드 정리]

* 절대값 (abs)
    - 음수나 양수의 절대값을 구합니다.
    - 예시: Math.abs(-5)는 5, Math.abs(-3.14)는 3.14를 리턴합니다.

* 올림값 (ceil)
    - 소수점 이하를 올림하여 double 타입으로 리턴합니다.
    - 예시: Math.ceil(5.3)은 6.0, Math.ceil(-5.3)은 -5.0을 리턴합니다.

* 버림값 (floor)
    - 소수점 이하를 버림하여 double 타입으로 리턴합니다.
    - 예시: Math.floor(5.3)은 5.0, Math.floor(-5.3)은 -6.0을 리턴합니다.

* 최대값 (max)
    - 두 값 중 더 큰 값을 리턴합니다.
    - 예시: Math.max(5, 9)는 9, Math.max(5.3, 2.5)는 5.3을 리턴합니다.

* 최소값 (min)
    - 두 값 중 더 작은 값을 리턴합니다.
    - 예시: Math.min(5, 9)는 5, Math.min(5.3, 2.5)는 2.5를 리턴합니다.

* 랜덤값 (random)
    - 0.0 이상 1.0 미만의 임의의 double 값을 리턴합니다.
    - 예시: Math.random()은 0.0 <= v11 < 1.0 범위를 가집니다.

* 반올림값 (round)
    - 소수점 첫째 자리를 반올림하여 long 타입으로 리턴합니다.
    - 예시: Math.round(5.3)은 5, Math.round(5.7)은 6을 리턴합니다.


```java
// Java Math 클래스 코드 예시
int v1 = Math.abs(-5);
double v2 = Math.abs(-3.14);

double v3 = Math.ceil(5.3);
double v4 = Math.ceil(-5.3);

double v5 = Math.floor(5.3);
double v6 = Math.floor(-5.3);

int v7 = Math.max(5, 9);
double v8 = Math.max(5.3, 2.5);

int v9 = Math.min(5, 9);
double v10 = Math.min(5.3, 2.5);

double v11 = Math.random();

long v14 = Math.round(5.3);
long v15 = Math.round(5.7);

```