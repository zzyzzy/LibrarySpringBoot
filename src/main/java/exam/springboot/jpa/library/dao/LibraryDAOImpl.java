package exam.springboot.jpa.library.dao;

import exam.springboot.jpa.library.model.Library;
import exam.springboot.jpa.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("lbdao")
public class LibraryDAOImpl implements LibraryDAO {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public Map<String, Object> selectLibrary(int cpg) {
        Pageable paging =
            PageRequest.of(cpg, 25, Sort.by("lbno").descending());

        List<Library> lblist = libraryRepository.findAll(paging).getContent();
        int cntpg = libraryRepository.findAll(paging).getTotalPages();

        Map<String, Object> libs = new HashMap<>();
        libs.put("lblist", lblist);
        libs.put("cntpg", cntpg);

        return libs;
    }

    /*@Override
    public int countLibrary() {

        return libraryRepository.countLibraryBy();
    }*/

}
