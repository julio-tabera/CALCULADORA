package calculadora.demo.calculadora.ACURSO_JAVASCRIPT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/curso")
public class JavascriptController {
    
    @RequestMapping ("/")
    public String Curso(){


        return "curso-javascript/curso";

    }

    @RequestMapping("/calculadora")
        public String Calculadora(){


        return "curso-javascript/calculadora";

    }

}
