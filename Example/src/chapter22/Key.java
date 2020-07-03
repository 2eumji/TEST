package chapter22;

//HashMap 
public class Key {
	public int number;
	public Key(int number){
		this.number=number;
	}
	//�����ͺ��̽����� ���ؼ� ���� �����ö� ���� ���
	@Override //equals �������̵� (������ �ּҸ� ���Ը��� Object�� equals�� ����ؼ�)
				//Object�� equals�� ���������  �����ε��� �Ҽ������ϱ�(�Ƚ��Ǿ��־) �ٷκ񱳸� ���ϰ�
				//�������̵�(�ȿ� ���뺯��)���� ������Ʈ�� ��ü�� ���� ������ Ŭ����(Key)�� �ٿ�ĳ������ ���� ��
				//�񱳸� ���ش�
	public boolean equals(Object obj) { //<<-������ƮŬ������ �������ִ� equals�޼ҵ�
		
		if(obj instanceof Key) { //�� �� ��ü�� �ֳ�(�޸𸮸��������ֳ�)? ������-->if������
			Key compareKey=(Key)obj; //�񱳸� ���� �ΰ�
			if(number==compareKey.number) { //����number�� ���� Object obj�� ���� ����
				return true;
			}else {
				return false;
			}
		}
		return false;//��ü�� ������ false
	}
	@Override
	public int hashCode() {	//hashcode �������̵� (�������� �ּҸ� ���Ը���)
		return number;
	}
}
