package app.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class DemoAspect {

    @Before("point_cut() && args(msg, trg)")
    public void logging(JoinPoint point, String msg, String trg) {

        System.out.println("*****");
        System.out.println("Название метода: " + point.getSignature().toString());
        System.out.println("Входные аргументы: ");
        Arrays.asList(point.getArgs()).forEach(System.out::println);
        System.out.println("Журнал: Сообщение: [" + msg + "], адресат: " + trg);
        System.out.println("*****\n");
    }

    @Pointcut("execution(* app.model.User.*(..))")
    public void point_cut() {
    }

}
