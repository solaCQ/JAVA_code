
public class Method {
	public static void main(String[] args){
		//�Ǿ�̬����Ҫ��ʵ��������ʹ��
		Method printstart = new Method();
		printstart.printstar(5);
		
		//��̬��������ֱ�ӵ���
		int s = sum();
		int s1 = sum(15,20);
		System.out.println(s);
		System.out.println(s1);

	}
	
	//��ʹ��static��������Ϊʵ������
	public void printstar(int n){
		//�˴�iҪ�������ͣ�����int
		for(int i=0;i<n;i++){
			System.out.println("*");
		}
	}
	
	//ʹ��static��������Ϊ��̬����
	public static int sum(){
		int i = 3;
		int j = 4;
		return i+j;
	}
	
	//��������ͬ���������������Ͳ�ͬ��Ϊ��������
	public static int sum(int i,int j){
		return i+j;
	}
	
}

//��������д�������棬���������������ᱨ��
//void err(){	
//}