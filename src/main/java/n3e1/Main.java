package n3e1;

import n2e1.ExecucioRuntime;
import n2e1.SerialitzadorCustom;
import n2e1.Telefon;

public class Main {
    public static void main(String[] args)  {
        Telefon huaweiP11 = new Telefon(634908802, "Huawei", "P11");
        String cami = SerialitzadorCustom.class.getAnnotation(ExecucioRuntime.class).path();
        SerialitzadorCustom.serialitzarRuntime(huaweiP11, cami);
    }
}
