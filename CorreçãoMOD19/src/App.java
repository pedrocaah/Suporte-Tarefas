import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Tabela(nome = "", sobrenome = "", idade = 0)
public class App {
    public static void main(String args[]) {
        Class clazz = Tabela.class;
        System.out.println(clazz);

        try {
            Constructor cons = clazz.getConstructor();
            Tabela tabela = (Tabela) cons.newInstance();
            System.out.println(cons);

            Field[] fields = tabela.getClass().getDeclaredFields();
            for (Field field : fields){
                Class<Tabela> type = (Class<Tabela>) field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

            Method[] Method = tabela.getClass().getDeclaredMethods();
            for (Method m : Method) {
                Class<Tabela> type = (Class<Tabela>) m.getReturnType();
                String nome = m.getName();
                System.out.println();
                System.out.println(nome);
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            /*throw new RuntimeException(e);*/
        }
    }
}
