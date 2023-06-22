package task1;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED, BORROWED -> {
                System.out.print("Статус книги успешно изменен! ");
                System.out.println(book.status + " -> " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            case OVERDUED -> System.out.println("Перевод книги из статуса 'AVAILABLE' " +
                             "в статус " + requestedStatus + " невозможен");
            default -> System.out.println("Статус не изменен!");
        }
    }
}
