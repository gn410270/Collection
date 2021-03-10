package collection;
//HashSet 以記憶體判別是否重複
import java.util.*;
public class HashSet01 {
	public static void main(String[] args) {
		HashSet<Integer> ha01=new HashSet<>();
		ha01.add(13);
		ha01.add(31);
		ha01.add(26);
		ha01.add(54);
		ha01.add(99);
		ha01.add(31);//重複
		ha01.add(54);//重複
		ha01.add(null);//----------->加入「空」也可以
		System.out.println(ha01);
		
		//-----------------------------------
		HashSet<String> ha02=new HashSet<>();
		ha02.add("JAVA");
		ha02.add("JAVA");//重複
		ha02.add("JAVA");//重複
		ha02.add("JaVa");
		ha02.add("JAvA");
		ha02.add("Java");
		System.out.println(ha02);
		
		//------------------------------------
		HashSet<HashSet02> ha03=new HashSet<>();
		ha03.add(new HashSet02());
		ha03.add(new HashSet02());
		ha03.add(new HashSet02());
		ha03.add(null);//----------->加入「空」也可以
		System.out.println(ha03);
	}
}
class HashSet02{
	@Override
	public int hashCode() {
		//return super.hashCode();    
		return 100;                              //修改後會造成誤判(ha03)
	}

	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		return true;                              //修改後會造成誤判(ha03)
	}
}
