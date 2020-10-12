package computer_lkl;

public class HardDisk {
	protected int amount;

	protected int speed;

    

    public HardDisk() {



    }

    int getAmount(){

        return amount;

    }

    int getSpeed(){

        return speed;

    }

    void setAmount(int amount){

        this.amount = amount;

    }

    void setSpeed(int speed,String x){

        this.speed = speed;

    }



    public HardDisk(int amount, int speed) {

        this.amount = amount;

        this.speed = speed;

    }

}
