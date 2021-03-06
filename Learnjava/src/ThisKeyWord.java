/**
 * this 关键字的用法
 * 
 * @author chenqiang
 *
 */
public class ThisKeyWord {
	public static void main(String[] args)
	{
		Person2 per = new Person2();
		per.pid = 1;
		per.name = "tom";
		per.age = 20;
		per.display();
		
		//this构造方法调用,注意输出 有 “this pid --”
		Person2 per2 = new Person2(2,"kate",21);
		per2.display();
		
		//返回当前对象
		Person2 per3 = per2.getInstance();
		per3.display();
	}

}

class Person2
{
	int pid;
	String name;
	int age;
	
	void display()
	{
		//表示当期对象的引用
		String msg = this.pid+","+this.name+","+this.age;
		System.out.println(msg);
	}
	
	public Person2(){
		
	}
	
	public Person2(int pid){
		System.out.println("this pid ---");
		this.pid =pid;
	}
	
	
	public Person2(int pid,String name,int age){
		//用this调用构造方法 Person2(int pid)
		this(pid);
		this.pid = pid;
		this.name = name;
		this.age = age;
		
	}
	
	//返回当前实例
	public  Person2 getInstance(){
		this.pid = 3;
		this.name = "Tony";
		this.age = 22;
		return this;
	}
	
	
	
	
	
}