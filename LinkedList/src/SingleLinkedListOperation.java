
import javafx.application.Application;
import javafx.stage.Stage;

public class SingleLinkedListOperation extends Application {

    private static void singleListBasicOpertion(SingleLinkedList singleLinkedList) {
        singleLinkedList.head = new SingleLinkedList.Node(1);
        SingleLinkedList.Node second = new SingleLinkedList.Node(2);
        SingleLinkedList.Node third = new SingleLinkedList.Node(3);
        singleLinkedList.head.next = second;
        second.next = third;
        third.next = null;
        singleLinkedList.printList();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleListBasicOpertion(singleLinkedList);
    }

}
