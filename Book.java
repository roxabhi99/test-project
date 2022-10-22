class Book
{
private int bookid;
String bookname;
Book(int bookid,String bookname)
{
this.bookid=bookid;
this.bookname=bookname;
}
public int getBOOKID()
{
return bookid;
}
public void setBOOKID(int bookid)
{
this.bookid=bookid;
}
}