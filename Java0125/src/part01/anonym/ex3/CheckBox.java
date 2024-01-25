//4 p.441 연습문제 3번
package part01.anonym.ex3;

public class CheckBox {

	static interface OnSelectListener{
		void onSelect();
	}
	
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	

}
