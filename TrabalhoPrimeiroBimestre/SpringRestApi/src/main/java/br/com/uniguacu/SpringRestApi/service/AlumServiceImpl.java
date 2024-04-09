package br.com.uniguacu.SpringRestApi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.uniguacu.SpringRestApi.model.Alum;
import br.com.uniguacu.SpringRestApi.repository.IAlumRepository;

@Service
public class AlumServiceImpl implements AlumService{
    @Autowired
    private IAlumRepository alumRepository;

    @Override
    public Alum save(Alum alum) {
        return alumRepository.save(alum);
    }
    @Override
    public List<Alum> findAll(){
        return alumRepository.findAll();
    }
}
