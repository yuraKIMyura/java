package part01.nestedInter;

public class Button {

	onClickListener listener;
	
	void setOnClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface onClickListener{
		void onClick();
	}
	
	
	
}
