import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class JavaStruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arraylist
		//Arraylist는 Lis 인터페이스의 구현 클래스
		// 자바에서 배열은 초기화 시 그 크기가 고정되어야하고 사용 중에 크기를 
		//변경할 수 없다는 점에서 Arraylist는 가치가 있다. 
		//설정하고 싶은 초기 용량이 n이라고 했을 때에는 아래와 같이 선언한다.
		
		int size;
		//객체를 생성
		List<String> list = new ArrayList<String>();
		
		// .add -> 앞에서 부터 차례로 값을 추가
		list.add("A"); //1
		list.add("B"); //2
		list.add("C"); //3
		list.add("D"); //4
		list.add("E"); //5
		list.add("F"); //6
		//.set을 이용하면 원하는  index에 원하는 값을 삽입 할 수 있다.
		list.set(4,"k" );//7
		//.size()를 이용하여 list 의 size를 구할 수 있다.
		size = list.size();
		System.out.println(size); //6
		
		for(String i : list) {
			System.out.println(i);
		}
		
		for(int i = 0 ; i  < size; i++) {
			//get()을 이용하여 원하는 index의 값을 출력 할 수 있다.
			System.out.println(i+"번째 : " + list.get(i));			
		}
		
		//remove()를 통해 원하는 index의 값을 삭제 할 수 있다.
		list.remove(1);
		list.remove(1);
		
		size = list.size();
		
		for(int i = 0 ; i  < size; i++) {
			System.out.println(i+"번째 : " + list.get(i));			
		}
		//저장소의 용량 확장에는 ArrayList<E>의 단점이라 말할 수 있는 문제점이 있다. 
		//바로, 저장소의 용량을 늘리는 과정에서 많은 시간이 소요된다는 점이다. 
		//저장 공간 부족으로 ArrayList의 용량을 늘리게 되는 경우, 기존의 ArraList에
		//추가하는 것이 아닌, 확장된 크기의 ArrayList를 새로 생성하고, 
		//그 새로 생성된 ArrayList에 기존의 ArrayList 값들을 복사해주는 과정을 거친다. 
		//그리고 기존의 ArrayList는 가비지 컬렉션에 의해 메모리에서 제거된다.
		//따라서 ArrayList에서 용량을 늘린다는 것은 새로운 배열 인스턴스의 생성과 
		//기존 데이터의 복사가 필요한 번거로운 작업이 되는 것이다. 
		
		//Vector
		List<String> list1 = new Vector<String> ();
		
		//Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 
		//동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만
		//다른 스레드가 실행을 할 수 있다. 따라서 멀티 스레드 환경에서 안전하게 객체를 
		//추가, 삭제할 수 있다. 
		//객체를 추가하고 삭제하고 가져오는 메소드는 ArrayList 코드와 같다.
		
		//LinkedLIst
		//LinkedList는 List 구현 클래스이므로 ArrayList와 사용하는 메소드는 같지만
		//내부 구조는 완전 다르다. ArrayList는 내부 배열 객체를 저장해서 인덱스로 관리하지만,
		//LinkedList는 양방향 포인터 구조로, 각각마다 인접하는 참조를 링크해서 체인처럼 관리한다.
		
		//LinkedList는 특정 인덱스의 객체를 제거하거나 삽입하면, 
		//앞 뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 
		//그러므로 중간 삽입/삭제가 빈번할 수록 LinkedList를 쓰는 것이 효율적이다. 
		//반대로, 순차적인 삽입/삭제가 빈번하다면 ArrayList를 사용하는 것이 효율적이다. 

		//LinkedList를 생성할 때, 처음에는 어떠한 링크도 만들어지지 않기 때문에 내부적으로 비어있다
		
		List<String> list2 = new LinkedList<String>();
		//연결리스트
		//LinkedList 클래스는 스택과 큐를 구현하는 데에 자주 쓰인다.
		//그 중 큐는 자바에서 일반적으로 두가지 방법으로 구현된다. 
		//배열을 사용하여 구현하거나, LinkedList나 ArrayList 클래스를 사용
		
		//LinkedList -> Queue 자료구조 구현
		//큐를 구현할 때 사용하는 메소드를 집어넣기 위해서는 반드시 
		//LinkedList<E> list = new LinkedList<E>(); 라는 생성자를 사용해야한다는 점이였다. 
		//그 말은 즉, offer(), poll(), peek() 와 같은 메소드가 List인터페이스에서 제공하지 않는, 
		//LinkedList클래스만의 메소드라는 말이 되겠다.
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		 
        //Queue에 삽입
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        queue.offer(55);
 
        System.out.println(queue);
        System.out.println(queue.poll()); //Queue에서 맨 앞 요소 제거하며 읽기
        System.out.println(queue);
        System.out.println(queue.peek()); //Queue에서 제거하지 않고 맨 뒤 요소 읽기
 
        System.out.println();
        
        
        ListIterator<Integer> it = queue.listIterator();
        if(it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.previous());
            System.out.println(it.previous());
        }
        
        
        //set : 인터페이스 : 이런게 있다 정도만 알면 된다...
        // 추가로 공부가 필요하면 검색해서사용법을 익혀보자
        //데이터의 저장 순서를 유지하지 않는다.
        //같은 데이터의 중복 저장을 허용하지 않는다. 
        //따라서 null도 하나의 null만 저장할 수 있다.
        //Set 컬렉션은 List 컬렉션처럼 인덱스로 객체를 검색해서
        //가져오는 메소드가 없다. 
        //대신 전체 객체를 대상으로 한 번 씩 다 가져오는 반복자, 
        //Iterator을 제공한다. 
        
        //Set<String> setExample = new...;
        //Iterator<String> iterator = setExample.iterator();
        //while(iterator.hasNext()){
         //   String getin = iterator.next();
        //}

        // Set 인터페이스를 구현한 주요 클래스는 3개
        // 1. HashSet
         Set<String> set = new HashSet<String>();
        // 2. TreeSet
        //3.LinkedHashSet
        
        //Map : 인터페이스
        //Map 컬렉션에는 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다. 
         //여기서 키와 값은 모두 객체이다. 
         //값은 중복 저장이 가능하지만, 키는 중복 저장이 불가능하다. 
         //Set과 마찬가지로, Map 컬렉션에서는 키 값의 중복 저장이 허용되지 않는데,
         //만약 중복 저장 시 먼저 저장된 값은 저장되지 않은 상태가 된다. 
         //즉, 기존 값은 없어지고 새로운 값으로 대체되는 것이다. 

         //HashSet에서처럼, 프로그래머는 HashMap과 HashTable 모두 키로 
         //사용할 객체에 대해 hashCode()와 equals() 메소드를 오버라이딩하여 
         //같은 객체가 될 조건을 정의할 수 있다. 

         //HashMap
          //HashMap은 Map 인터페이스 구현을 위해 해시테이블을 사용한 클래스이다. 
         //또한 중복을 허용하지 않고 순서를 보장하지 않는다.
         //중요한 점은, HashTable과 다르게 HashMap은 키와 값으로 
         //null값이 허용된다는 것이다.
         
         Map<String,Integer> map = new HashMap<String,Integer>();
         
         //전화번호부프로그램 만들기
         
	}

}
