# 2020322083杨东奇 计 G202

## 1.实验内容

* 1.用类描述计算机中的CPU的速度和硬盘的容量。
* 2.要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类；
* 3.类中定义不少于两个构造方法；
* 4.每个类定义不少于两个属性，切属性的类型应该多样化；
* 5.尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义方法内有合理的逻辑判断；
* 6.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法;

## 3.实验方法

1.设置cpu类，给cpu对象定义speed、name方法，将cpu类单独放在computer_lk1包中，为了体会不同包中的调用区别。

	package computer_lk1;
	public class cpu {
	public int speed;

	public String name;
	
2.设置pc、HardDisk、Test类，将这三各类放置在另一个包computer_lkl中，同第一步为了体会不同包中的调用区别。<br/>	
		
	package computer_lkl;
	import computer_lk1.cpu;
	public class test {
	public static void main(String[] args){
	
## 4.核心方法

1.实例化。
	 
	cpu cpu = new cpu();
        HardDisk hd = new HardDisk();
	pc pc=new pc();
	
2.调用方法，当调用的cpu类中的对象时需要导入CPU所在的包。

	cpu.setName("i7");
        cpu.setSpeed(2200);
        hd.setAmount(200);
        hd.setSpeed(5400, null);
        pc.setCpu(cpu);
        pc.setHardDisk(hd);
        pc.show();
	
 3.设置show()方法,用来输出cpu的名字，速度和HardDisk的容量以及速度。
 	
	void show(){

        System.out.println("cpu's name is " + cpu.getName());

        System.out.println("cpu's speed is " + cpu.getSpeed());

        System.out.println("HardDisk's capacity is " + hd.getAmount() + "GB");

        System.out.println("HardDisk's speed was " + hd.getSpeed());

    }
## 4.实验结果

	cpu's name is i7;
	cpu's speed is 2200;
	HardDisk's capacity is 200GB;
        HardDisk's speed was 5400;
	
## 5.实验感想
   1.学习了构造方法实例化和调用方法，但是此项目构造方法我不会使用，写了两个空的方法体<br/>
   2.体会到了不同包中的各类关系。<br/>
   3.学会了权限修饰符private protected 的用法和含义。<br/>
   
