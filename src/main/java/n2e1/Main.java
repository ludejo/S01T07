package n2e1;

public class Main {
    public static void main(String[] args)  {
        Telefon huaweiP10 = new Telefon(634908635, "Huawei", "P10");
        SerialitzadorCustom.serialitzar(huaweiP10);
    }
}
