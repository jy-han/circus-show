package jy.circusactor;

import jy.circus.Animal;
import jy.circus.IAct;
/**
 * 猴子类
 * @author 0366418
 * 继承自父类Animal类，实现接口IAct功能。描述猴子属性：品种
 */
public class Monkey extends Animal implements IAct{

	//成员属性：品种
	private String type;
	
	public Monkey(String name, int age, String type){
		super(name, age);
		this.setType(type);
	}
	
	//get、set方法
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	//重写父类中喜好的方法
	@Override
	public String love() {
		return "喜欢模仿人的动作表情";
	}

	//重写接口中技能的方法
	@Override
	public String skill() {
		return "骑独轮车过独木桥";
	}

	//重写接口中表演的方法
	@Override
	public String act() {
		return "表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n品种："+this.getType()+"\n技能："+this.skill()+"\n爱好："+this.love();
	}

}
