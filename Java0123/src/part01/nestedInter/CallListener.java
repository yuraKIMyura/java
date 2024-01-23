package part01.nestedInter;

import part01.nestedInter.Button.onClickListener;

public class CallListener implements Button.onClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
