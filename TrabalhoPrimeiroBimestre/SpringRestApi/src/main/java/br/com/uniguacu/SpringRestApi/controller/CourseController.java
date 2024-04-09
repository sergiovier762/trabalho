package br.com.uniguacu.SpringRestApi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uniguacu.SpringRestApi.model.Course;
import br.com.uniguacu.SpringRestApi.service.CourseService;

@RestController
@RequestMapping("/api/v1/Trabalhoum")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> create( @RequestBody Course course){
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.save(course));
    }
}

