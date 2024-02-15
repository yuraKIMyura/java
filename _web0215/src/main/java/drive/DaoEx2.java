package drive;

import java.util.List;

import dao.BoardDao;
import dto.Board;

public class DaoEx2 {

	public static void main(String[] args) {
		
		//왜 BoardDTO로 객체 생성하면 안 됨?
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.selectList();
		for(Board b : list) {
			System.out.println(b);
		}
		
		list.stream().forEach(b->System.out.println(b));
	}

}
