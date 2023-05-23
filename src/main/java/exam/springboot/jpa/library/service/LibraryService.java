package exam.springboot.jpa.library.service;

import exam.springboot.jpa.library.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryService {

    Map<String, Object> readLibrary(int cpg);
    //int countLibrary();

}
