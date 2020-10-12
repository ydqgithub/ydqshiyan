package computer_lkl;

import computer_lk1.cpu;

public class test {
	public static void main(String[] args){

        cpu cpu = new cpu();

        HardDisk hd = new HardDisk();

        cpu.setName("i7");

        cpu.setSpeed(2200);

        hd.setAmount(200);

        hd.setSpeed(5400, null);

        pc pc = new pc();

        pc.setCpu(cpu);

        pc.setHardDisk(hd);

        pc.show();

    }

}
