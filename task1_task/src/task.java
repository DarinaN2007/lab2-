
class Button
{
    private int clickCount = 0;
    public int click()
    {
        clickCount++;
        System.out.println("Кнопка нажата. Всего нажатий: " + clickCount);
        return clickCount;
    }
}
public class task {
    public static void main(String[] args) {

        Button b1 = new Button();
        int click = b1.click();
        click = b1.click();
        Button b2 = new Button();
        int click2 = b2.click();
        System.out.println("Итог:");
        System.out.println("Нажатий на b1: " + click);
        System.out.println("Нажатий на b2: " + click2);
    }
}
