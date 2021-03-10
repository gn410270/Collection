package collection;
//有排序功能
import java.util.*;
public class TreeSet01 {
	public static void main(String[] args) {
		TreeSet<Integer> tre01=new TreeSet<>();
		tre01.add(65);
		tre01.add(13);
		tre01.add(52);
		tre01.add(35);
		tre01.add(99);//重複
		tre01.add(99);//重複
		tre01.add(99);//重複
		System.out.println(tre01);
		System.out.println(tre01.first());
		System.out.println(tre01.last());
		System.out.println(tre01.headSet(99));
		System.out.println(tre01.subSet(35,99));
		System.out.println(tre01.tailSet(35));
		
		//----------------------------------------
		TreeSet<String> tre02=new TreeSet<>();
		tre02.add("APPLE"); 
		tre02.add("apple");
		tre02.add("123");
		tre02.add("@");
		tre02.add("田");//按照部首
		tre02.add("甲");
		tre02.add("由");
		tre02.add("你");
		System.out.println(tre02); 
		//排列順序： 數字-->符號-->英文大寫-->英文小寫-->中文字
		
		TreeSet<Student> tre03=new TreeSet<>(new MyCompare());  //
		tre03.add(new Student("AAA", 59));
		tre03.add(new Student("MMM", 77));
		tre03.add(new Student("CCC", 88));
		tre03.add(new Student("DDD", 99));
		tre03.add(new Student("GGG", 13));
		tre03.add(new Student("FFF", 13));  //score重複
		tre03.add(new Student("JJJ", 13));   //score重複
		tre03.add(new Student("AAA", 13)); //score重複  name重複
		tre03.add(new Student("AAA", 78)); //name重複
		System.out.println(tre03.toString()); 
	}
}

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return name + "/"+ score +" ";
	}
	
}

class MyCompare implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {  //compare適用於非字串
		return s1.score-s2.score;  //由小到大
		//return s2.score-s1.score;  //由大到小
		//return s1.name.compareTo(s2.name);  //按照"字串"排序
	}
}