package pk6;

public class CarGas {
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		//gas�� 0�̸� gas�� �����ϴ�->false
		if(gas==0) {
			System.out.println("gas�������ϴ�");
			return false;
		}else {
			System.out.println("gas�� �ֽ��ϴ�");
			return true;
		}
	}
	//gas�� 0���� ũ�� �޸��ϴ�. gas������ 
	//�ݴ� ����ϴ� gas������
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("�޸��ϴ�");
				System.out.println("gas ������ : "+gas);
				gas-=1;
			}else {
				System.out.println("����ϴ�");
				System.out.println("gas ������ : "+gas);
				return;
			}
		}
	}
	
}
