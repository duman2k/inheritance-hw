package task1;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED, AVAILABLE -> {
                System.out.print("Статус книги успешно изменен! ");
                System.out.println(book.status + " ->" + requestedStatus);
                book.setStatus(requestedStatus);
            }
            case BORROWED -> System.out.println("Перевод книги из статуса 'OVERDUED' " +
                             "в статус " + requestedStatus + " невозможен");
            default -> System.out.println("Статус не изменен!");
        }
    }
}
