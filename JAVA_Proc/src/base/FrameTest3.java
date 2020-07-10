//화면 중앙에 프레임창 위치하기
package base;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest3 {
	public static void main(String[] args) {

		Frame fr=new Frame("세번째");
		fr.setSize(400, 400);
		
		/*화면 중앙에 프레임 위치시키기
		 * 1.실행중인 모니터의 해상도를 알아야한다
		 * 2.모니터 중앙 좌표를 알아야한다
		 * 3.프레임의 좌우 크기를 중앙좌표에서 뺴준다
		 * */
		
		//툴킷을 사용하여 해상도 얻어오기
		Toolkit tk=Toolkit.getDefaultToolkit(); 
		
		Dimension di=tk.getScreenSize();
		int monitorW=di.width;
		int monitorH=di.height;
		
//  	x:모니터 중앙 좌표값 - 내가 만들려는 프레임의 width/2
//  	y:모니터 중앙 좌표값 - 내가 만들려는 프레임의 height/2
		int x=monitorW/2-fr.getWidth()/2;
		int y=monitorH/2-fr.getHeight()/2;
		
		fr.setLocation(x, y);
		fr.setVisible(true);
		
	}
}
