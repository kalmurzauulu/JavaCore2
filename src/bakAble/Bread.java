package bakAble;

public class Bread implements BakAble{
    @Override
    public void baked() {
        System.out.println("Хлеб будет готов за 10 минкт при 300 градусов");
    }
}
