package This_is_Java.src;

import java.io.*;
import java.util.*;

public class ReferenceType_05 {
    public static void main(String[] args) throws IOException{
        // 자바의 데이터 타입은 기본 타입과 참조 타입으로 분류된다.
        // 참조 타입이란 객체의 번지를 참조하는 타입으로 배열, 열거, 클래스, 인터페이스 타입이 존재한다.
        // 참조 타입으로 선언된 변수는 객체가 생성된 메모리 번지를 저장한다.
        int age = 25;
        double price = 100.5; // 기본 타입 변수
        // 변수들은 모두 스택 메모리 영역에 생성된다. age와 price는 직접 값을 저장하고 있다.
        
        String name = "신용권";
        String hobby = "독서"; // 참조 타입 변수
        // 하지만 참조 타입 변수인 name과 hobby는 힙 메모리 영역의 String 객체 번지를 저장하고 
        // 이 번지를 통해 String 객체를 참조한다.

        // ==, != 연산자는 참조 타입에서 사용 시 동일 객체인지 비교한다.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = arr2;
        System.out.println(arr1 == arr2); // false
        System.out.println(arr2 == arr3); // true

        // 자바에서 참조타입의 경우에 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가지게 할 수 있다.
        int[] intArray = null;
        // int a = null; -> type missmatch
        intArray[0] = 10; // NullPointerException
    }
}
