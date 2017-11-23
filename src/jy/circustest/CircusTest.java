package jy.circustest;

import java.util.Scanner;

import jy.circus.IAct;
import jy.circusactor.Bear;
import jy.circusactor.Clown;
import jy.circusactor.Lion;
import jy.circusactor.Monkey;
import jy.circusactor.Parrot;

/**
 * 马戏团测试类
 * @author 0366418
 * 马戏团节目管理
 */
public class CircusTest {

	//选择表演者的方法
	public void showList(){
		System.out.println("*********欢迎来到太阳马戏团**********");
		System.out.println("*********  请选择表演者  **********");
		System.out.println("*********    1.棕熊    **********");
		System.out.println("*********    2.狮子    **********");
		System.out.println("*********    3.猴子    **********");
		System.out.println("*********    4.鹦鹉    **********");
		System.out.println("*********    5.小丑    **********");

	}
	
	public static void main(String[] args) {
		//实例化对象：棕熊、狮子、猴子、鹦鹉、小丑
		CircusTest test = new CircusTest();
		IAct actor1 = new Bear("Bill", 1);
		IAct actor2 = new Lion("Lain", 2, "灰色", "公狮");
		IAct actor3 = new Monkey("Tom", 1, "金丝猴");
		IAct actor4 = new Parrot("Rose", 1, "牡丹鹦鹉");
		IAct actor5 = new Clown("Kahle", 5);
		
		
		Scanner input = new Scanner(System.in);
		int see, selectNum;

		do{
			test.showList();
			//判断表演者
			do{
				selectNum = input.nextInt();
				switch(selectNum){
				case 1:
					System.out.println(actor1.act());
					break;
				case 2:
					System.out.println(actor2.act());
					break;
				case 3:
					System.out.println(actor3.act());
					break;
				case 4:
					System.out.println(actor4.act());
					break;
				case 5:
					System.out.println(actor5.act());
					break;
				default:
					System.out.println("** 输入信息不正确，请重新输入 **");
					test.showList();
				}
			}while(selectNum > 5 || selectNum < 1);
			
			//判断是否继续观看表演
			System.out.println("\n********  是否继续观看（1/0） ********");
			see = input.nextInt();
			while(see != 0 && see !=1){
				System.out.println("** 输入信息不正确，请重新输入 **\n********  是否继续观看（1/0） ********");
				see = input.nextInt();
			}
			
		}while(see != 0);
		System.out.println("********   欢迎下次光临   ********");
		
		input.close();
	}

}
