package jy.circus;
/**
 * 抽象父类：动物类
 * @author 0366418
 * 描述动物属性：昵称、年龄，具有的方法：动物喜好
 */
public abstract class Animal {

	//成员属性：昵称、年龄
	private String name;
	private int age;
	
	//构造方法
	public Animal(){
	}
	public Animal(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	//get、set方法
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		//判断年龄范围
		if(age < 0 || age > 50)
			this.age = 1;
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	//抽象成员方法：喜好love
	public abstract String love();
	
}
