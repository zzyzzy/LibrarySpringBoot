package exam.springboot.jpa.library.dao;

import exam.springboot.jpa.library.model.Library;

import java.util.List;

public interface LibraryDAO {

    List<Library> selectLibrary(int cpg);

}
