package at.htlleonding;

public class Main {

    public static void main(String[] args) {
        GiftManager giftManager = new GiftManager();
        giftManager.importCsvFiles();
        giftManager.printGiftList();
    }
}
