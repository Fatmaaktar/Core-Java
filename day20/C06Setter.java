package day20;

public class C06Setter {
    private int sayi;
 private String str;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "C06Setter{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }
    
}
