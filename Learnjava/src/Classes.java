/**
 * 
 * @author chenqiang
 *��Ĺ���:���ԡ����췽��������
 */



public class Classes {
	
public static void main(String[] args){
		//ʹ��new�ؼ��֣�ʵ��������
		Person kim = new Person();
		//����ʹ������������Ժͷ���
		kim.age = 20;
		kim.name = "kim";
		kim.pid = 2012;
		kim.display();
		
	}
}	
	
class  Person{
	
	
	
	//����  public ��ʾ���ã�����ֱ�ӷ���
	public int pid;
	public String name;
	public int age;
	
	//���췽��
	Person(){
		//����ͬ��
	}
	
	//��ͨ����
	public  void display(){
		String output;
		output = pid+","+name+","+age;
		System.out.println(output);
	}
	
	
	//��֮��Ĺ���������ϵ
	
	class Cpu {
		
	}
	
	class Rom{
		
	}
	
	class Phone{
		//Phone����Cpu���Rom�����
		Cpu cpu;
		Rom rom;
	}
	
	
	}

