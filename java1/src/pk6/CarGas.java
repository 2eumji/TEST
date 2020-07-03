package pk6;

public class CarGas {
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		//gas가 0이면 gas가 없습니다->false
		if(gas==0) {
			System.out.println("gas가없습니다");
			return false;
		}else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}
	//gas가 0보다 크면 달립니다. gas보유량 
	//반대 멈춥니다 gas보유량
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("달립니다");
				System.out.println("gas 보유량 : "+gas);
				gas-=1;
			}else {
				System.out.println("멈춥니다");
				System.out.println("gas 보유량 : "+gas);
				return;
			}
		}
	}
	
}
