
public class ArrayList {
	public static void main(String[]args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add("200");
		list.add("100");
		list.add("300");
		list.add("400");
		System.out.println(list);
		int size = list.size();
		System.out.println("the size of list is:"+size);
		boolean b =list.contains(100);
		System.out.println("list contains 100? Ans:"+b);
		list.add(500);
		System.out.println(list);
		
		list.remove(Integer.valueOf(200));
		System.out.println("list after removing 200 value :"+list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println("index number of 200 is:"+list.indexof(800));
	}

}
