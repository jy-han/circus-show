package jy.circusactor;

import jy.circus.Animal;
import jy.circus.IAct;
/**
 * 棕熊类
 * @author 0366418
 * 继承自父类Animal类，实现接口IAct功能。
 */
public class Bear extends Animal implements IAct{

	public Bear(String name, int age){
		super(name, age);
	}
	
	//重写接口中技能的方法
	@Override
	public String skill() {
		return "挽着花篮，打着雨伞，自立走秀";
	}

	//重写父类中喜好的方法
	@Override
	public String love() {
		return "喜欢卖萌";
	}

	//重写接口中表演的方法
	@Override
	public String act() {
		return "表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n技能："+this.skill()+"\n爱好："+this.love();
	}

}
