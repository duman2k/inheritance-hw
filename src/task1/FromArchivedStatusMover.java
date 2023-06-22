package task1;

public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE -> {
                System.out.print("Статус книги успешно изменен! ");
                System.out.println(book.status + " -> " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            case BORROWED,OVERDUED ->  System.out.println("Перевод книги из статуса 'ARCHIVED' " +
                                       "в статус " + requestedStatus + " невозможен");
            default -> System.out.println("Статус не изменен!");
        }
    }
}
