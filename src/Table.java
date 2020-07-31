import java.util.Scanner;

public class Table {
void table_meth(){
	int num,a=1,b;
	
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	
	b=num;
	
	for(int i=0;i<10;i++) {
		System.out.println(num+"*"+a+"="+b);
		a++;
		b=b+num;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Table tab =new Table();
tab.table_meth();
		

	}

}
