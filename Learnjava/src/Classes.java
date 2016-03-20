/**
 * 
 * @author chenqiang
 *类的构成:属性、构造方法、方法
 */



public class Classes {
	
public static void main(String[] args){
		//使用new关键字，实例化对象
		Person kim = new Person();
		//对象使用类里面的属性和方法
		kim.age = 20;
		kim.name = "kim";
		kim.pid = 2012;
		kim.display();
		
	}
}	
	
class  Person{
	
	
	
	//属性  public 表示公用，可以直接访问
	public int pid;
	public String name;
	public int age;
	
	//构造方法
	Person(){
		//跟类同名
	}
	
	//普通方法
	public  void display(){
		String output;
		output = pid+","+name+","+age;
		System.out.println(output);
	}
	
	
	//类之间的关联依赖关系
	
	class Cpu {
		
	}
	
	class Rom{
		
	}
	
	class Phone{
		//Phone类由Cpu类和Rom类组成
		Cpu cpu;
		Rom rom;
	}
	
	
	}

