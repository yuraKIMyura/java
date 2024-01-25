//4 p.441 연습문제 3번
package part01.anonym.ex3;

import part01.anonym.ex3.CheckBox.OnSelectListener;

public class Main {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		}
		);
		checkBox.select();
	}

}
