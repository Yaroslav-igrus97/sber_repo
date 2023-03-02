package Part_1;
import java.lang.annotation.*;

@Target(value= {ElementType.TYPE, ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
public @interface IsLike {
    boolean myBool();
}
