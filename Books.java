public class Books
{
    static int TotalNoOfBooks;

    String Title;
    String Author;
    String ISBN;
    boolean isBorrowed;

    static 
    {
        TotalNoOfBooks = 0;
    }

    {
        TotalNoOfBooks++;
    }

    Books(String Title, String Author,String ISBN)
    {
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
    }

    Books(String ISBN)
    {
        this("Unknown","Unknown",ISBN);
    }

    static int getTotalNoOfBooks()
    {
        return TotalNoOfBooks;
    }

    void BorrowedBook()
    {
        if(isBorrowed)
        {
            System.out.println("The Book Is Already Borrowed");
        }
        else
        {
            this.isBorrowed = true;
            System.out.println("Enjoy The Book");
            TotalNoOfBooks--;
        }
    }

    void ReturnBook()
    {
        if(isBorrowed)
        {
            this.isBorrowed = false;
            System.out.println("Hope You Enjoyed The Book");
            TotalNoOfBooks++;
        }
        else
        {
            System.out.println("This Book Is Already In Library");
        }
    }

    public static void main(String[] args)
    {
        Books KeyOfSuccess = new Books("Success","Author1","1");
        Books MySecondBook = new Books("Secondbook","Author2","2");
        System.out.println("Total Number Of Books In Library : " + Books.getTotalNoOfBooks());
        KeyOfSuccess.BorrowedBook();
        MySecondBook.BorrowedBook();
        KeyOfSuccess.BorrowedBook();
        KeyOfSuccess.ReturnBook();
        System.out.println(Books.getTotalNoOfBooks());
    }
}