package jy.circusactor;

import jy.circus.Animal;
import jy.circus.IAct;
/**
 * 狮子类
 * @author 0366418
 * 继承自父类Animal类，实现接口IAct功能。描述狮子属性：性别、颜色
 */
public class Lion extends Animal implements IAct {

	//成员属性：颜色、性
	private String sex, color;
	
	//构造方法
	public Lion(String name, int age, String sex, String color){
		super(name, age);
		this.setSex(sex);
		this.setColor(color);
	}
	
	//get、set方法
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if(!sex.equals("公") || !sex.equals("母"))
			this.sex = "公";
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//重写父类中喜好的方法
	@Override
	public String love() {
		return "喜欢吃各种肉类";
		
	}

	//重写接口中技能的方法
	@Override
	public String skill() {
		return "擅长钻火圈";
	}

	//重写接口中表演的方法
	@Override
	public String act() {
		return "表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n性别："+this.getSex()+"\n毛色："+this.getColor()+"\n技能："+this.skill()+"\n爱好："+this.love();
	}

}
