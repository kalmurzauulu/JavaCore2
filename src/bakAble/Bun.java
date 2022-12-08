package bakAble;

public class Bun implements BakAble{
    @Override
    public void baked() {
        System.out.println("Булочка будет готова за 20 минут при 200 градусов");
    }
}
