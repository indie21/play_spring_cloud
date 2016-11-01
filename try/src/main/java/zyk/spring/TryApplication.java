package zyk.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TryApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =
            new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

    }

}
