package com.mr.people;

import com.mr.idcard.IDcard;

public class People {

	private Integer id;//Ψһ�Ա�ʶ
	
	private String name;//��������
	
	private String sex;//�����Ա�
	
	private Integer age;//��������
	
	private IDcard idcard;//����������֤�����id����

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public IDcard getIdcard() {
		return idcard;
	}

	public void setIdcard(IDcard idcard) {
		this.idcard = idcard;
	}
}