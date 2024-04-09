package br.com.uniguacu.SpringRestApi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.uniguacu.SpringRestApi.model.Course;
import br.com.uniguacu.SpringRestApi.repository.ICourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private ICourseRepository corseRepository;

    @Override
    public Course save(Course course) {
        return corseRepository.save(course);
    }
    @Override
    public List<Course> findAll(){
        return corseRepository.findAll();
    }
}