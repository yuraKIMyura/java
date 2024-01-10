//240101 PDF ch04 객체배열 
package sec05;

import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) { 
	this.title = title;
	this.author = author;
	}
}//class

public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2]; // Book 배열 선언
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
		System.out.print("제목>>");
		String title = scanner.nextLine();
		System.out.print("저자>>");
		String author = scanner.nextLine();
		book[i] = new Book(title, author); // 배열 원소 객체 생성
		}
		for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + ", " + book[i].author + ")\n");
		
		
		System.out.println("도서명 검색>");
		String search = scanner.nextLine();
		for(int i=0; i<book.length; i++) {
			if(search.equalsIgnoreCase(book[i].title)) {
				System.out.println(book[i].title + ", " + book[i].author);
				break;
			}else {
				System.out.println("검색 결과 없음");
			}
		}//for

		scanner.close();
		
	}//main

}//class



