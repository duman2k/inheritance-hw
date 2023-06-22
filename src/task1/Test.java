package task1;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Бойцовский клуб");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        getCurrentStatusThenMoveStatus(book, Status.ARCHIVED);
        getCurrentStatusThenMoveStatus(book, Status.BORROWED);
        getCurrentStatusThenMoveStatus(book, Status.ARCHIVED);
        getCurrentStatusThenMoveStatus(book, Status.OVERDUED);
        getCurrentStatusThenMoveStatus(book, Status.BORROWED);
    }

    private static void getCurrentStatusThenMoveStatus(Book book, Status status){
        BookMover bookMover = new BookMover();

        switch (book.status) {
            case ARCHIVED -> bookMover = new FromArchivedStatusMover();
            case AVAILABLE -> bookMover = new FromAvailableStatusMover();
            case BORROWED -> bookMover = new FromBorrowedStatusMover();
            case OVERDUED -> bookMover = new FromOverduedStatusMover();
        }

        bookMover.moveToStatus(book, status);
    }
}
