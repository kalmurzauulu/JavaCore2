package tikBurch;

public class TikBurch {
    public int uzunu;
    public int tuurasy;

    public int ayant(){
        return tuurasy*uzunu;
    }

    public TikBurch(int uzunu, int tuurasy) {
        this.uzunu = uzunu;
        this.tuurasy = tuurasy;
    }



    public TikBurch() {
    }

    public int getUzunu() {
        return uzunu;
    }

    public void setUzunu(int uzunu) {
        this.uzunu = uzunu;
    }

    public int getTuurasy() {
        return tuurasy;
    }

    public void setTuurasy(int tuurasy) {
        this.tuurasy = tuurasy;
    }


}

