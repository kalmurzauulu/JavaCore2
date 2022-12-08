package catKlass;

import java.util.Arrays;

public class Klass {
    String[] soz;
    int [] san;

    public Klass() {
    }

    public Klass(String[] soz, int[] san) {
        this.soz = soz;
        this.san = san;
    }

    @Override
    public String toString() {
        return "Class{" +
                "soz=" + Arrays.toString(soz) +
                ", san=" + Arrays.toString(san) +
                '}';
    }
}
