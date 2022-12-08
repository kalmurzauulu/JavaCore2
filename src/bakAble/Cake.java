package bakAble;

public class Cake implements BakAble{
    @Override
    public void baked() {
        System.out.println("Пирог будет готов за 30 минут при 40 градусов");
    }
}
