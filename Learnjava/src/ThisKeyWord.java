/**
 * this �ؼ��ֵ��÷�
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
		
		//this���췽������,ע����� �� ��this pid --��
		Person2 per2 = new Person2(2,"kate",21);
		per2.display();
		
		//���ص�ǰ����
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
		//��ʾ���ڶ��������
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
		//��this���ù��췽�� Person2(int pid)
		this(pid);
		this.pid = pid;
		this.name = name;
		this.age = age;
		
	}
	
	//���ص�ǰʵ��
	public  Person2 getInstance(){
		this.pid = 3;
		this.name = "Tony";
		this.age = 22;
		return this;
	}
	
	
	
	
	
}