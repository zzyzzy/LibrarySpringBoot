package exam.springboot.jpa.library.controller;

import exam.springboot.jpa.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LibraryController {

    @Autowired
    LibraryService lbsrv;

    @GetMapping("/")
    public ModelAndView list(Integer cpg) {
        ModelAndView mv = new ModelAndView();

        if (cpg == null || cpg == 0) cpg = 1;

        Map<String, Object> libs = lbsrv.readLibrary(cpg);

        mv.addObject("lblist", libs.get("lblist"));
        mv.addObject("cpg", cpg);
        mv.addObject("cntpg", libs.get("cntpg"));
        mv.addObject("stpg", ((cpg - 1)/10) * 10 + 1);

        mv.setViewName("list");

        return mv;
    }

}
