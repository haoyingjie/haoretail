package hellogit;

import animal.Dog;

public class HelloGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello git this is my first 。java！");
		
		User zhangsan=new User();
		zhangsan.setAge(23);
		zhangsan.setName("张宝宝");
		
		System.out.println(zhangsan.getName()+"年龄是："+zhangsan.getAge()+"说"+zhangsan.speak("张楚岚，你干啥子！"));
		Dog dog=new Dog();
		dog.setName("逗逗");
		System.out.println(zhangsan.getName()+"have a dog named "+dog.getName());
		
	}


}
