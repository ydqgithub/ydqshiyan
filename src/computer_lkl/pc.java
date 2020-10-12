package computer_lkl;

import computer_lk1.cpu;

public class pc {
	protected cpu cpu;

	protected HardDisk hd;

    void setCpu(cpu cpu){

        this.cpu = cpu;

    }

    void setHardDisk(HardDisk hd){

        this.hd = hd;

    }



    void show(){

        System.out.println("cpu's name is " + cpu.getName());

        System.out.println("cpu's speed is " + cpu.getSpeed());

        System.out.println("HardDisk's capacity is " + hd.getAmount() + "GB");

        System.out.println("HardDisk's speed was " + hd.getSpeed());

    }
}
