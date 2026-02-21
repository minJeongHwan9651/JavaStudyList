package Coding_Test;

import java.util.*;
import java.io.*;

public class DataStructure {
    // 표준 입출력
    // BufferedReader
    // InputStreamReader
    // StringTokenizer
    // StringBuilder

    // 일반 데이터타입
    // 1.숫자: int, long, float, double (+ Math 클래스)
    // 2.문자, 문자열: char, String
    // 3.배열: arr (+ Arrays 클래스)
    // 4.논리연산: boolean(+ 삼항 연산자)
    // 5.Object Type
    // + class: Pair, 각종 만들어볼 수 있는 객체들(Person, Node, Line, ...)
    // + function: (+ 재귀함수)
    // + for, foreach, while, if

    // 자료구조(Collections - 물론 Map은 Collections에 포함 안됨.)
    // 1. 리스트: Vector(느림->안씀), ArrayList, LinkedList
    // 2. 스택, 큐, 덱: Stack(Deque 사용하기, Monotonic Stack), Queue(인스턴스는 덱으로, 또는 LinkedList), Deque
    // 3. 우선 순위 큐: Priority Queue
    // 4. 셋(집합): TreeSet, HashSet, LinkedHashSet(안 써도 됨)
    // 5. 맵(키-값): TreeMap, HashMap, LinkedHashMap(안 써도 됨)
    // Collections 클래스 이용하기

    static StringBuilder sb = new StringBuilder(); // 출력시 사용하는 StringBuilder. 
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException{
        // throws IOException: 이 코드에서 발생할 수 있는 예외는 IO뿐이므로 이것만 던지면 해결된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 표준 입력을 빠르게 받아주는 Reader
        String getInput = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 특정 문자를 기준으로 토큰 형태로 파싱해준다. 
        int n = Integer.parseInt(st.nextToken()); // .nextToken() 메서드를 이용하여 토큰을 순서대로 가져온다.

        sb.setLength(0); // StringBuilder를 초기화 해야 할 경우 해당 방법 사용.
        System.out.println(sb);
    }

    @SuppressWarnings("unused")
    public void numFunction(int param){
        // 함수 정의하는 방법: 리턴형을 입력하고 함수명과 매개변수를 입력한다.
        String str = "1234";
        int numberInt = Integer.parseInt(str); // 문자열을 정수형 int로 바꿔준다. int, long, float, double에 모두 동일한 기능 존재함.
        int digitInt = Integer.parseInt(str, 2); // 진법 변환 시에는 인자를 두 개 적어준다.

        String numberToString = Integer.toString(numberInt); // 정수형을 문자열로 바꿔준다.

        int limitValue = Integer.MAX_VALUE; // 가장 큰 값, 가장 작은 값을 지정하는 것도 가능하다.
        int limitUnderValue = Integer.MIN_VALUE;

        int isEqual = Integer.compare(numberInt, digitInt); // 왼쪽이 크면 1, 같으면 0, 작으면 -1
    }

    @SuppressWarnings("unused")
    public void strFunction(){
        String str = "my new String";

        // StringBuilder(append, toString, reverse, setLength), StringTokenizer 잘 조합해서 사용하기.
        // length, charAt, substring, indexof, contains, deleteCharAt
        // toCharArray, toUpperCase, toLowerCase, isDigit, String.valueOf
        // equals, compareTo
    }

    @SuppressWarnings("unused")
    public void arrFunction(){
        int N = 100;
        int[] testArr = new int[N];
        System.out.println(testArr.length);

        String[] testStr = new String[10];
        long[] longArr = new long[N];
        // long 배열 만들기.
        // String, Char 배열 만들기.
        // clone, length
        
        // Arrays 클래스: Collections 처럼 배열 클래스 컨트롤 가능.
        // toString, deepToString(2차원 배열), sort, fill, copyOfRange(파이썬 슬라이싱), asList, copyOf
        Arrays.fill(testArr, 0);
    }

    // Pair, Tuple 같은 형태의 자료구조는 Java에 존재하지 않으므로, 직접 작성해준다.
    public static class Pair implements Comparable<Pair>{
        public int x, y;

        // 생성자(Constructor) 재정의
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair p){
            return 1;
        }
        // toString, hashCode
    }

    @SuppressWarnings("unused")
    static void collectionsFunction(){
        int N = 2; // 숫자를 매개변수로 넣어주면 크기 지정 가능 -> 속도가 빨라진다.
        List<Pair> list = new ArrayList<>(N); // ArrayList: 파이썬의 List 자료구조와 동일. 가변 길이의 리스트이며 Vector보다 빠르다.(스레드 환경 신경 안쓰므로)
        // add, remove, get, set, contains, isEmpty, size
        
        Deque<Integer> stack = new ArrayDeque<>();
        // LinkedList stack은 실무에선 많이 쓰지만, 코딩테스트에서는 쓰이지 않는다.
        // push, pop, peek, isEmpty

        Queue<Integer> queueList = new LinkedList<>();
        Deque<Integer> dequedQueue = new ArrayDeque<>();
        // offer, poll, peek, isEmpty

        Deque<Integer> deque = new ArrayDeque<>();
        // offerFirst, offerLast, pollFirst, pollLast, peekFirst, peekLast, isEmpty

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return p1.x - p2.x;
            }
        }); // Priority Queue는 매개변수로 Comparator를 받을 수 있는데, 이걸 기준으로 요소를 정렬한다.

        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        // add, remove, contains, toArray, ... Set을 ArrayList로 옮길 시에는 생성자에 인자로 넣어주기만 하면 된다.

        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> hashMap = new HashMap<>();
        // put, get, getOrDefault, remove, containsKey, keySet

        Collections.sort(list, (o1, o2) -> {
            return o1.x - o2.x;
        }); // Collections의 메서드(sort) 이용하기. Comparator는 람다식으로 작성 가능.

        // Collections 메서드
        // reverse, max, min, reverseOrder
        // swap, frequency, rotate
    }

}

