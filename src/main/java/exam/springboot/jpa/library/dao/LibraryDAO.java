package exam.springboot.jpa.library.dao;

import exam.springboot.jpa.library.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryDAO {

    Map<String, Object> selectLibrary(int cpg);
    //int countLibrary();

}
