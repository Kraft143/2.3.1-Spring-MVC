package app.model;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
/* чтобы удостовериться, что таймер не будет пересоздан, добавили
 аннотацию @Scope("singleton") к классу Timer, хотя это и не обязательно, т.к. синглтон является дефолтным скоупом */
@Scope("singleton")
public class Timer {

    private Long nanoTime = System.nanoTime();
    private java.util.Timer timer = new java.util.Timer();

    public Long getTime() {
        return nanoTime;
    }
}
