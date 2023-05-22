package exam.springboot.jpa.library.service;

import exam.springboot.jpa.library.dao.LibraryDAO;
import exam.springboot.jpa.library.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lbsrv")
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryDAO lbdao;

    @Override
    public List<Library> readLibrary(int cpg) {
        return lbdao.selectLibrary(cpg - 1);
    }

    @Override
    public int countLibrary() {
        return lbdao.countLibrary();
    }

}
