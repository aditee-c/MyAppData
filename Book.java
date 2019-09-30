class Book{
	private int bookId;
	private String name;
	private String author;
	
	public void getBookId(int bookId){
		this.bookId= bookId;
	}
	public setBookId(int bookId){
		System.out.println("Book Id is set");
		return bookId;
	}
	
	public void getBookId(String name){
		this.name= name;
	}
	public setBookId(String name){
		return name;
	}
		public void getAuthor(String author){
		this.author= author;
	}
	public setAuthor(String author){
		return author;
	}
}