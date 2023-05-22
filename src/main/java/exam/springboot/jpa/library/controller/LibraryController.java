package exam.springboot.jpa.library.controller;

import exam.springboot.jpa.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {

    @Autowired
    LibraryService lbsrv;

    @GetMapping("/")
    public ModelAndView list(Integer cpg) {
        ModelAndView mv = new ModelAndView();

        if (cpg == null || cpg == 0) cpg = 1;
        mv.addObject("lblist", lbsrv.readLibrary(cpg));

        mv.setViewName("list");

        return mv;
    }

}
