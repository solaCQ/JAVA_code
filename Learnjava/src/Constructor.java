/**
 * 
 * @author chenqiang
 *���캯����  constructor
 *���캯���޷���ֵ
 *���캯��������һ�£���������
 */
public class Constructor {

	public static void main(String[] args)
	{
		//ʵ�����ǵ����˹��췽��
		Person1 per1 = new Person1();
		per1.display();
		
		//���췽������ʹ��
		Person1 per2 = new Person1(2,"kate",21);
		per2.display();
	}
}	



class Person1
	{
	
		
	 
		//Ĭ�Ϲ��췽�����޲����Ĺ��췽��
		public Person1()
		{
			//ʵ��������
			System.out.println("Person");
			//��ʵ����������ֵ
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
		
		
		//���췽������
		//�����ʾ�������вεĹ��췽�����޲εĹ��췽���������ṩʹ��
		public Person1(int pid,String name,int age)
		{
			this.pid = pid;
			this.name = name;
			this.age = age;
		}
		
		
		
	}
	
	
	
