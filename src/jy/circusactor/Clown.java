package jy.circusactor;

import jy.circus.IAct;
/**
 * 小丑类
 * @author 0366418
 * 实现IAct接口功能，描述小丑属性：名字、艺龄；具有着装特点方法
 */
public class Clown implements IAct{

	//成员属性：名字，艺龄
	private String name;
	private int years;
	
	//构造方法
	public Clown(){
		
	}
	public Clown(String name, int years){
		this.setName(name);
		this.setYears(years);
	}
	//get、set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	//重写接口中技能的方法
	@Override
	public String skill() {
		return "脚踩高跷，进行杂技魔术表演";
	}
	
	//成员方法：着装特点方法
	public String dress(){
		return "身穿五彩服装，头上戴着彩色的帽子，脸上化着夸张的彩妆";
	}
	
	//重写接口中表演的方法
	@Override
	public String act() {
		return "表演者："+this.getName()+"\n艺龄："+this.getYears()+"年\n着装："+this.dress()+"\n技能："+this.skill();
	}

}
