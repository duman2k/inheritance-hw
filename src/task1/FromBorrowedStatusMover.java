package task1;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED, AVAILABLE, OVERDUED -> {
                System.out.print("Статус книги успешно изменен! ");
                System.out.println(book.status + " -> " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            default -> System.out.println("Статус не изменен!");
        }
    }
}
