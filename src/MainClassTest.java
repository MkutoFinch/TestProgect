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

    @Test

    public void testGetClassNumber(){
        if (mainClass.getClassNumber() > 45){
            System.out.println("Успешно. Переменная getClassNumber больше 45-ти");
        } else {
            System.out.println("Тест провален. Переменная getClassNumber меньше 45-ти.");
        }
    }

    @Test

    public void testGetClassString(){
        if (mainClass.getClassString().contains("Hello") || mainClass.getClassString().contains("hello")){
        System.out.println("Успешно. Слово присутствует в строке.");
    }else System.out.println("Тест провален. Слово отсутствует в строке.");

}
}