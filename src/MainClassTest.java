import org.junit.Test;

public class MainClassTest extends MainClass{
    MainClass mainClass = new MainClass();
    @Test


    public void testGetLocalNumber(){
        if (mainClass.getLocalNumber() == 14) {
            System.out.println("Успешно. Переменная getLocalNumber равна 14-ти.");
        } else {
        System.out.println("Тест провален. Переменная getLocalNumber не равна 14-ти.");
        }
    }

}