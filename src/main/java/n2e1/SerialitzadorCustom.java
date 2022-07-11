package n2e1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

@ExecucioRuntime(path = "C:\\Users\\oriol\\OneDrive\\Desktop\\objecte_serialitzat.json")

public class SerialitzadorCustom {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public SerialitzadorCustom() {
    }
    public static void serialitzar(Object o) {
        try {
            String cami = SerialitzadorCustom.class.getAnnotation(ExecucioRuntime.class).path();
            objectMapper.writeValue(new File(cami), o);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void serialitzarRuntime(Object o, String cami) {
        try {
            //String cami = SerialitzadorCustom.class.getAnnotation(ExecucioRuntime.class).path();
            objectMapper.writeValue(new File(cami), o);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
