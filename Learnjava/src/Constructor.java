/**
 * 
 * @author chenqiang
 *构造函数，  constructor
 *构造函数无返回值
 *构造函数与类名一致，可以重载
 */
public class Constructor {

	public static void main(String[] args)
	{
		//实例化是调用了构造方法
		Person1 per1 = new Person1();
		per1.display();
		
		//构造方法重载使用
		Person1 per2 = new Person1(2,"kate",21);
		per2.display();
	}
}	



class Person1
	{
	
		
	 
		//默认构造方法，无参数的构造方法
		public Person1()
		{
			//实例化变量
			System.out.println("Person");
			//给实例变量赋初值
			 pid = 1;
			 age = 20;
			 name = "tom";
		}
		
		int pid;
		String name;
		int age;
		
		void display(){
			String msg = pid+","+name+","+age;
			System.out.println(msg);
		}
		
		
		//构造方法重载
		//如果显示定义了有参的构造方法，无参的构造方法将不再提供使用
		public Person1(int pid,String name,int age)
		{
			this.pid = pid;
			this.name = name;
			this.age = age;
		}
		
		
		
	}
	
	
	

