import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface Tabela {
    public String nome();
    public String sobrenome();
    public int idade();


}
