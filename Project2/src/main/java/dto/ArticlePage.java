package dto;

import java.util.List;

public class ArticlePage {

	private int total;
	private int currentPage;
	private List<Board> content;
	private int totalPages;
	private int startPage;
	private int endPage;
	
	//SIZE: 한 페이지 당 보여줄 목록의 수
	public ArticlePage(int total, int currentPage, int size, List<Board> content) {
		this.total = total;
		this.currentPage = currentPage;
		this.content = content;
		if (total==0) {
			totalPages=0;
			startPage =0;
			endPage =0;
		} else {
			totalPages = total/size;
			if(total % size >0) {
				totalPages++;
			}
			int modVal = currentPage % 5;
			startPage = currentPage / 5 * 5 + 1;
			if(modVal == 0) startPage -= 5;
			
			//startPage, endPage: 화면 하단 페이지 이동 링크 시작/끝 번호
			endPage = startPage + 4;
			if (endPage > totalPages ) endPage = totalPages;
			
		}
	}//method
	
	public boolean hasNoArticles() {
		return total == 0;
	}
	
	public boolean hasArticles() {
		return total > 0;
	}

	public int getTotal() {
		return total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public List<Board> getContent() {
		return content;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	
}
