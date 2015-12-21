package example2015;

import org.springframework.stereotype.Controller;    
import org.springframework.ui.Model;    
import org.springframework.web.bind.annotation.RequestMapping;    
    
@Controller  
public class GeneralController {
	@RequestMapping(value="index.do")    
    public void index_jsp(Model model){    
        model.addAttribute("str2015", "How Are You");    
        System.out.println("index.jsp");    
    }    
}
